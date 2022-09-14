package com.lkb.basemvp.di

import com.lkb.basemvp.splash.SplashActivity
import com.lkb.basemvp.splash.di.SplashModule
import com.lkb.basemvp.splash.di.SplashViewModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class BuildersModule {
    @ContributesAndroidInjector(modules = [SplashViewModule::class, SplashModule::class])
    abstract fun bindSplashActivity(): SplashActivity
}