package com.github.teren4m.base

import com.github.teren4m.base.mvvm.ListLiveData

class TestViewModel : ITestViewModel {

    override val items = ListLiveData<Int>()

    init {
        items.add(1)
    }

}