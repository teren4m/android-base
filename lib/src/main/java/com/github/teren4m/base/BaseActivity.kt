package com.github.teren4m.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import org.koin.android.ext.android.get

abstract class BaseActivity : AppCompatActivity() {

    protected abstract val toolbarId: Int
    protected abstract val layoutId: Int

    protected val toolbar: Toolbar by lazy { findViewById<Toolbar>(toolbarId) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        setSupportActionBar(toolbar)

        val some: String = get()
    }

}