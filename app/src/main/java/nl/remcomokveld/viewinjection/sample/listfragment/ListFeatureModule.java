package nl.remcomokveld.viewinjection.sample.listfragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ListFeatureModule {

    @ContributesAndroidInjector(modules = ListFragmentModule.class)
    abstract MyCustomFragment listFragment();

}
