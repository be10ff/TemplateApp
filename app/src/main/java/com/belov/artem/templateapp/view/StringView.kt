package com.belov.artem.templateapp.view

import com.belov.artem.templateapp.presentation.model.StringModel

/**
 * Created by artem on 26.12.16.
 */
interface StringView : ErrorView, ProgressView {

    fun onConnectionError()

    fun onStringResponce(text: StringModel)

}