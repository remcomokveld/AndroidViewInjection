package nl.remcomokveld.viewinjection.sample.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment;
import nl.remcomokveld.viewinjection.sample.R;
import nl.remcomokveld.viewinjection.library.HasViewInjector;

public abstract class BaseFragment extends DaggerFragment implements HasViewInjector {

    @Inject
    DispatchingAndroidInjector<View> viewInjector;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (view != null) {
            view.setTag(R.id.fragment, this);
        }
    }

    @Override
    public final AndroidInjector<View> viewInjector() {
        return viewInjector;
    }
}
