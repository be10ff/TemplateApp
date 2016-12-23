package com.belov.artem.templateapp.presentation.view;


import com.belov.artem.templateapp.presentation.model.AboutModel;

public interface AboutView {

    void onAbout(AboutModel model);


    void onError(String message);
}
