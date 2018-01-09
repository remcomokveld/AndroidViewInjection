package nl.remcomokveld.viewinjection.sample.app;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class MyApplication extends DaggerApplication {

    @Inject
    MyApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        DaggerMyApplicationComponent.builder().create(this).inject(this);
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return applicationComponent;
    }
}
