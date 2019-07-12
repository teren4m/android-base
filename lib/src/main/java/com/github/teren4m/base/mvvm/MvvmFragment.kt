package com.github.teren4m.base.mvvm

import android.os.Bundle
import android.view.View

abstract class MvvmFragment<VM : Any> : BaseFragment() {

    protected abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.setOnTouchListener { _, _ ->
            true
        }

    }
}