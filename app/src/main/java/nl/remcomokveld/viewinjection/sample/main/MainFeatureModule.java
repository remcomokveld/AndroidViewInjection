package nl.remcomokveld.viewinjection.sample.main;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import nl.remcomokveld.viewinjection.sample.listfragment.ListFeatureModule;

@Module
public abstract class MainFeatureModule {

    @ContributesAndroidInjector(modules = ListFeatureModule.class)
    abstract MainActivity mainActivity();
}
