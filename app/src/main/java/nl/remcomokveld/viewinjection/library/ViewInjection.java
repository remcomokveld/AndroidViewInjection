package nl.remcomokveld.viewinjection.library;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

import dagger.android.AndroidInjector;
import nl.remcomokveld.viewinjection.sample.R;

import static android.util.Log.DEBUG;
import static android.util.Log.e;
import static dagger.internal.Preconditions.checkNotNull;

public class ViewInjection {

    private static final String TAG = "ViewInjection";

    public static void inject(View view) {
        checkNotNull(view, "fragment");
        HasViewInjector hasFragmentInjector = findHasViewInjectionInHierarchy(view);
        if (Log.isLoggable(TAG, DEBUG)) {
            Log.d(
                    TAG,
                    String.format(
                            "An injector for %s was found in %s",
                            view.getClass().getCanonicalName(),
                            hasFragmentInjector.getClass().getCanonicalName()));
        }

        AndroidInjector<View> fragmentInjector = hasFragmentInjector.viewInjector();
        checkNotNull(
                fragmentInjector, "%s.fragmentInjector() returned null", hasFragmentInjector.getClass());

        fragmentInjector.inject(view);
    }

    private static HasViewInjector findHasViewInjectionInHierarchy(View view) {
        ViewParent parent = view.getParent();
        do {
            if (parent instanceof View)
                if (((View) parent).getTag(R.id.fragment) != null) {
                    Fragment f = (Fragment) ((View) parent).getTag(R.id.fragment);
                    return findHasViewInjectorInFragment(f);
                } else if (((View) parent).getId() == android.R.id.content) {
                    break;
                }
        } while ((parent = parent.getParent()) != null);

        return findHasViewInjectorInContext(view.getContext());
    }

    private static HasViewInjector findHasViewInjectorInContext(Context context) {
        if (context instanceof HasViewInjector) {
            return (HasViewInjector) context;
        } else if (context instanceof Activity) {
            return findHasViewInjectorInContext(context.getApplicationContext());
        } else if (context instanceof ContextWrapper) {
            return findHasViewInjectorInContext(((ContextWrapper) context).getBaseContext());
        }
        throw new RuntimeException("No HasViewInjector found");

    }

    private static HasViewInjector findHasViewInjectorInFragment(Fragment fragment) {
        if (fragment instanceof HasViewInjector) {
            return (HasViewInjector) fragment;
        }
        Fragment parentFragment = fragment;
        while ((parentFragment = parentFragment.getParentFragment()) != null) {
            if (parentFragment instanceof HasViewInjector) {
                return (HasViewInjector) parentFragment;
            }
        }
        Activity activity = fragment.getActivity();
        if (activity instanceof HasViewInjector) {
            return (HasViewInjector) activity;
        }
        if (activity.getApplication() instanceof HasViewInjector) {
            return (HasViewInjector) activity.getApplication();
        }
        throw new IllegalArgumentException(
                String.format("No injector was found for %s", fragment.getClass().getCanonicalName()));
    }

}
