package nl.remcomokveld.viewinjection.sample.customview;

import javax.inject.Inject;

public class MyCustomViewPresenter {

    private final MyCustomViewClickListener listener;

    @Inject
    MyCustomViewPresenter(MyCustomViewClickListener listener) {
        this.listener = listener;
    }

    void onClick() {
        listener.onClick();
    }
}
