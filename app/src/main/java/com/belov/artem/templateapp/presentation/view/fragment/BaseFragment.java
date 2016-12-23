package com.belov.artem.templateapp.presentation.view.fragment;

import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.belov.artem.templateapp.presentation.App;
import com.belov.artem.templateapp.presentation.di.component.ApplicationComponent;
import com.belov.artem.templateapp.presentation.di.module.ActivityModule;

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

    protected ApplicationComponent getApplicationComponent() {
        return ((App) getActivity().getApplication()).getApplicationComponent();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(getActivity());
    }
}
