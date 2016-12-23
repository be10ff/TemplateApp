package com.belov.artem.templateapp.data.entity.mapper.utils;

import com.belov.artem.templateapp.data.entity.AboutEntity;
import com.belov.artem.templateapp.domain.About;


public class EntityUtils {
    public static About transform(AboutEntity result) {
        About about = null;
        if (result != null){
            about = new About();
            about.text = result.text;
        }

        return about;
    }
}
