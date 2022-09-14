package com.lkb.basemvp

import android.app.Application
import com.lkb.basemvp.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App : Application(), HasAndroidInjector {
    @Inject
    lateinit var androidInject: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        val component = DaggerApplicationComponent.builder().application(this).build()
        component.inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInject
    }
}