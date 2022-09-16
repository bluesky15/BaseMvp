package com.lkb.basemvp.splash

import android.util.Log
import com.lkb.basemvp.Presenter
import com.lkb.basemvp.repo.SplashRepository

typealias SplashView = SplashContract.SplashView

class SplashPresenter(view: SplashView, repository: SplashRepository) :
    Presenter<SplashView, SplashRepository>(view, repository) {
    fun getPageData() {
        view?.onPageDataSuccess()
        Log.d(">>>", "method executed");
    }

}