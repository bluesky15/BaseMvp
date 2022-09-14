package com.lkb.basemvp.splash.di

import com.lkb.basemvp.splash.SplashActivity
import com.lkb.basemvp.splash.SplashContract
import dagger.Binds
import dagger.Module


@Module
abstract class SplashViewModule {
    @Binds
    abstract fun bindSplashView(splashActivity: SplashActivity):SplashContract.SplashView?
}