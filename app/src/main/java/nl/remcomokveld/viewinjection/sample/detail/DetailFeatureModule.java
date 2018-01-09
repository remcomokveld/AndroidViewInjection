package nl.remcomokveld.viewinjection.sample.detail;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class DetailFeatureModule {

    @ContributesAndroidInjector(modules = DetailActivityModule.class)
    abstract DetailActivity detailActivity();
}
