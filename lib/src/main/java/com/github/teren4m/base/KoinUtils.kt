package com.github.teren4m.base

import android.content.ComponentCallbacks
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf
import org.koin.core.scope.Scope

inline fun <reified T : Any> FragmentActivity.injectActivity() =
    inject<T> {
        parametersOf(this@injectActivity)
    }

inline fun <reified T : Any> Fragment.injectFragment() =
    inject<T> {
        parametersOf(this@injectFragment)
    }

inline fun <reified T : Any> ComponentCallbacks.getObject(vararg args: Any): T =
    get {
        parametersOf(args)
    }

inline fun <reified R, reified T1> Scope.getObject(f: (T1) -> R): R =
    f(get())

inline fun <reified R, reified T1, reified T2> Scope.getObject(f: (T1, T2) -> R): R =
    f(get(), get())

inline fun <reified R, reified T1, reified T2, reified T3> Scope.getObject(f: (T1, T2, T3) -> R): R =
    f(get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4> Scope.getObject(f: (T1, T2, T3, T4) -> R): R =
    f(get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5> Scope.getObject(f: (T1, T2, T3, T4, T5) -> R): R =
    f(get(), get(), get(), get(), get())

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6> Scope.getObject(f: (T1, T2, T3, T4, T5, T6) -> R): R =
    f(get(), get(), get(), get(), get(), get())
