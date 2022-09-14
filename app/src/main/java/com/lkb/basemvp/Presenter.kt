package com.lkb.basemvp

import io.reactivex.rxjava3.disposables.CompositeDisposable


abstract class Presenter<V : View, R : Repository>(
    @Volatile var view: V?,
    @Volatile var repository: R
) {
     val compositeDisposable = CompositeDisposable()


    fun onStop() {
        view = null
        compositeDisposable.clear()
    }


}