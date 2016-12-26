package com.belov.artem.templateapp.presenter

import com.belov.artem.templateapp.view.StringView

/**
 * Created by artem on 26.12.16.
 */
interface StringPresenter {

    fun setView(view: StringView)

    fun getString()

}