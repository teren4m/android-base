package com.github.teren4m.base.mvvm

class ActionLiveEvent : SingleLiveData<Unit>() {

    override fun call() {
        value = Unit
    }
}