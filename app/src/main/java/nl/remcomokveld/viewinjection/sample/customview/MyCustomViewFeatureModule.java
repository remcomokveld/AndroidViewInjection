package nl.remcomokveld.viewinjection.sample.customview;

import android.view.View;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import nl.remcomokveld.viewinjection.library.ViewKey;

@Module(subcomponents = MyCustomViewComponent.class)
public abstract class MyCustomViewFeatureModule {

    @Binds
    @IntoMap
    @ViewKey(MyCustomView.class)
    abstract AndroidInjector.Factory<? extends View> bindMyListViewFactory(MyCustomViewComponent.Builder builder);
}
