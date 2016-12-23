package com.belov.artem.templateapp.presentation.view;

import com.belov.artem.templateapp.data.entity.AboutEntity;

public interface AboutViewInt {

    void onAbout(AboutEntity model);
    void onError(String message);
}
