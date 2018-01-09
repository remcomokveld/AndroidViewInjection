package nl.remcomokveld.viewinjection.library;

import android.view.View;

import dagger.android.AndroidInjector;

public interface HasViewInjector {
    AndroidInjector<View> viewInjector();
}
