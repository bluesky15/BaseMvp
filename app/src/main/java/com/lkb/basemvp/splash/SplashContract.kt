package com.lkb.basemvp.splash

import com.lkb.basemvp.Presenter
import com.lkb.basemvp.View

interface SplashContract {
    interface SplashView:View{
        fun onPageDataSuccess()
    }
    interface Presenter{
       fun logOutUser()
    }

}