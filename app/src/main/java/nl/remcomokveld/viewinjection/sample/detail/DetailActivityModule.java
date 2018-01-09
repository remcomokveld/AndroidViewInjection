package nl.remcomokveld.viewinjection.sample.detail;

import dagger.Binds;
import dagger.Module;
import nl.remcomokveld.viewinjection.sample.customview.MyCustomViewClickListener;
import nl.remcomokveld.viewinjection.sample.customview.MyCustomViewFeatureModule;

@Module(includes = MyCustomViewFeatureModule.class)
public abstract class DetailActivityModule {
    @Binds
    abstract MyCustomViewClickListener bindListener(DetailActivity activity);
}
