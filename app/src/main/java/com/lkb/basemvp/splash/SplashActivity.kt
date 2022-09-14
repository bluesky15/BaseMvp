package com.lkb.basemvp.splash

import android.os.Bundle
import com.lkb.basemvp.BaseActivity
import com.lkb.basemvp.R

class SplashActivity : BaseActivity<SplashPresenter>(), SplashContract.SplashView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.xyx()
    }

    override fun getData() {

    }

    override fun showLoadingDialog(active: Boolean) {

    }

    override fun onError(msg: String) {

    }

    override fun showToast(res: Int) {

    }


}