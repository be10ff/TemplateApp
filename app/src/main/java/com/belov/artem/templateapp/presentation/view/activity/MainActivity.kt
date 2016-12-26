package com.belov.artem.templateapp.presentation.view.activity


import android.os.Bundle

import com.belov.artem.templateapp.R
import com.belov.artem.templateapp.presentation.view.fragment.FirstFragment

import butterknife.ButterKnife
import cyber.ru.activities.BaseActivity


class MainActivity : BaseActivity() {

    override val layoutResource: Int
        get() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        addFragment(R.id.flContent, FirstFragment())
    }

}
