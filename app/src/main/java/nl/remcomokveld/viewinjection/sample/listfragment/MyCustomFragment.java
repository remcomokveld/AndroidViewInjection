package nl.remcomokveld.viewinjection.sample.listfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nl.remcomokveld.viewinjection.sample.R;
import nl.remcomokveld.viewinjection.sample.base.BaseFragment;
import nl.remcomokveld.viewinjection.sample.detail.DetailActivity;
import nl.remcomokveld.viewinjection.sample.customview.MyCustomViewClickListener;

public class MyCustomFragment extends BaseFragment implements MyCustomViewClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_fragment, container, false);
    }

    @Override
    public void onClick() {
        startActivity(new Intent(getContext(), DetailActivity.class));
    }
}
