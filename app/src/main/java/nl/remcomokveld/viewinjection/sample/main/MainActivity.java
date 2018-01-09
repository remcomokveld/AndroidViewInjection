package nl.remcomokveld.viewinjection.sample.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import nl.remcomokveld.viewinjection.sample.R;
import nl.remcomokveld.viewinjection.sample.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
}
