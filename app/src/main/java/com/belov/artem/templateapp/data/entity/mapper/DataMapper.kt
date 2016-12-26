package com.belov.artem.templateapp.data.entity.mapper

import com.belov.artem.templateapp.data.entity.StringEntity
import com.belov.artem.templateapp.presentation.model.StringModel

/**
 * Created by artem on 26.12.16.
 */
class DataMapper {
    fun transform (entity : StringEntity) : StringModel = StringModel(entity.text)
}