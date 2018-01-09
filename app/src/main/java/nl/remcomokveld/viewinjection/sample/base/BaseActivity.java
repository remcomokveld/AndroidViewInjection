package nl.remcomokveld.viewinjection.sample.base;

import android.view.View;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity;
import nl.remcomokveld.viewinjection.library.HasViewInjector;

public abstract class BaseActivity extends DaggerAppCompatActivity implements HasViewInjector {

    @Inject
    DispatchingAndroidInjector<View> viewInjector;

    @Override
    public final AndroidInjector<View> viewInjector() {
        return viewInjector;
    }
}
