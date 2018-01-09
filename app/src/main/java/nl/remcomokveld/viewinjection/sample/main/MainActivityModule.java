package nl.remcomokveld.viewinjection.sample.main;

import dagger.Module;
import nl.remcomokveld.viewinjection.sample.listfragment.ListFeatureModule;

@Module(includes = {ListFeatureModule.class})
public abstract class MainActivityModule {
}
