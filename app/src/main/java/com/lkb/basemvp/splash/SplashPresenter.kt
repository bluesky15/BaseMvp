package com.lkb.basemvp.splash

import android.util.Log
import com.lkb.basemvp.Presenter
import com.lkb.basemvp.SplashRepository

class SplashPresenter(view: SplashContract.SplashView, repository: SplashRepository) :
    Presenter<SplashContract.SplashView, SplashRepository>(view, repository) {

    fun xyx() {
        Log.d(">>>", "method executed");
    }
}