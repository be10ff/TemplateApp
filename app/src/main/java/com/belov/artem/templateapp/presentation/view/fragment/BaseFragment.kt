package com.belov.artem.templateapp.presentation.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import butterknife.ButterKnife
import com.trello.rxlifecycle.components.support.RxFragment

/**
 * Created by artem on 26.12.16.
 */
abstract class BaseFragment : RxFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(layoutResource, container, false)
        if (view != null) {
            ButterKnife.bind(this, view)
        }
        return view
    }

    abstract val layoutResource: Int

    abstract fun onBackPressed()

    fun toast(resource: Int) {
        Toast.makeText(activity, resource, Toast.LENGTH_LONG).show()
    }

    fun toast(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_LONG).show()
    }
}