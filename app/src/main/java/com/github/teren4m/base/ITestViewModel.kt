package com.github.teren4m.base

import androidx.lifecycle.LiveData

interface ITestViewModel {

    val items: LiveData<List<Int>>

}