package com.github.teren4m.base.mvvm

import androidx.lifecycle.LiveData
import java.util.*

class ListLiveData<T : Any> @JvmOverloads constructor(initialCapacity: Int = 100) : LiveData<List<T>>() {

    init {
        value = ArrayList(initialCapacity)
    }

    fun add(items: List<T>) {
        getList().apply {
            addAll(items)
            setValue(value)
        }
    }

    fun add(item: T) {
        getList().apply {
            add(item)
            setValue(value)
        }
    }

    fun clear() {
        getList().apply {
            clear()
            setValue(value)
        }
    }

    private fun getList(): ArrayList<T> =
        value as ArrayList<T>

}