package bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bondarenko.samsungit.classwork.fragmentsandviewmodel.R;

public class GreenFragment extends BaseFragment {

    private GreenViewModel mViewModel;

    public static GreenFragment newInstance() {
        return new GreenFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.green_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        setTitle("GREEN");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(GreenViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public String setTitle(String title) {
        return "GREEN";
    }
}
