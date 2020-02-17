package bondarenko.samsungit.classwork.fragmentsandviewmodel.ui.fragments;

import android.support.v4.app.Fragment;

public abstract class BaseFragment extends Fragment {
    private String title;

    public abstract String setTitle(String title);

    public String getTitle() {
        return title;
    }
}
