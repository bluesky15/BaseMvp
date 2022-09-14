package com.lkb.basemvp.splash.di

import com.lkb.basemvp.SplashRepository
import com.lkb.basemvp.splash.SplashContract
import com.lkb.basemvp.splash.SplashPresenter
import dagger.Module
import dagger.Provides

@Module
class SplashModule {
    @Provides
    fun provideSplashPresenter(
        view: SplashContract.SplashView,
        repo: SplashRepository
    ): SplashPresenter {
        return SplashPresenter(view, repo)
    }
}