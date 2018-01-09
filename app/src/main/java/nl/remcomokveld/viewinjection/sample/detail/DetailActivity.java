package nl.remcomokveld.viewinjection.sample.detail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import nl.remcomokveld.viewinjection.sample.R;
import nl.remcomokveld.viewinjection.sample.base.BaseActivity;
import nl.remcomokveld.viewinjection.sample.customview.MyCustomViewClickListener;

public class DetailActivity extends BaseActivity implements MyCustomViewClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
    }

    @Override
    public void onClick() {
        Toast.makeText(this, "OnCustomViewClicked", Toast.LENGTH_SHORT).show();
    }
}
