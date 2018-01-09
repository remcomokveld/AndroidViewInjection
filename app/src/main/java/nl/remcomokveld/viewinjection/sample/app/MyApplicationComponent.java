package nl.remcomokveld.viewinjection.sample.app;

import dagger.Component;
import dagger.android.AndroidInjector;
import nl.remcomokveld.viewinjection.sample.detail.DetailFeatureModule;
import nl.remcomokveld.viewinjection.sample.main.MainFeatureModule;
import nl.remcomokveld.viewinjection.library.AndroidViewInjectionModule;

@Component(modules = {
        AndroidViewInjectionModule.class,
        MainFeatureModule.class,
        DetailFeatureModule.class
})
public interface MyApplicationComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApplication> {

    }
}
