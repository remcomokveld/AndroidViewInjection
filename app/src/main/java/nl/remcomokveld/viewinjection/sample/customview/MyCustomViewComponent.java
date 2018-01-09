package nl.remcomokveld.viewinjection.sample.customview;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface MyCustomViewComponent extends AndroidInjector<MyCustomView> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MyCustomView> {
    }
}
