package com.lkb.basemvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

abstract class BaseActivity<P : Presenter<*, *>> : AppCompatActivity(), View {
    @Inject
    protected lateinit var presenter: P
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}