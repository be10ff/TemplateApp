package com.belov.artem.templateapp.presentation.mapper;

import com.belov.artem.templateapp.domain.About;
import com.belov.artem.templateapp.presentation.model.AboutModel;

import javax.inject.Inject;

public class AboutModelDataMapper {

    @Inject
    public AboutModelDataMapper() {
    }

    public AboutModel transform(About about) {
        if (about == null) {
            throw new IllegalArgumentException("Cannot transformResults a null value");
        }
        AboutModel model = new AboutModel();
        model.text = about.text;

        return model;
    }
}
