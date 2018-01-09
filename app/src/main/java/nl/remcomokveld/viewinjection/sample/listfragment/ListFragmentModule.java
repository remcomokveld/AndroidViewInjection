package nl.remcomokveld.viewinjection.sample.listfragment;

import dagger.Binds;
import dagger.Module;
import nl.remcomokveld.viewinjection.sample.customview.MyCustomViewClickListener;
import nl.remcomokveld.viewinjection.sample.customview.MyCustomViewFeatureModule;

@Module(includes = MyCustomViewFeatureModule.class)
public abstract class ListFragmentModule {

    @Binds
    abstract MyCustomViewClickListener bindListener(MyCustomFragment activity);

}
