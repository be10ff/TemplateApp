package com.belov.artem.templateapp.presentation.view.fragment;

import android.support.v4.app.Fragment;
import android.widget.Toast;


/**
 * Created by artem on 15.12.16.
 */

public class BaseFragment extends Fragment{

    @SuppressWarnings("unchecked")
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>)getActivity()).getComponent());
    }

    protected void message(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }

}
