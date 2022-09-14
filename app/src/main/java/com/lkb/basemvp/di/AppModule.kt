package com.lkb.basemvp.di

import android.content.Context
import com.lkb.basemvp.App
import dagger.Module
import dagger.Provides

@Module
internal class AppModule {

    @Provides
    @ApplicationContext
    fun provideContext(application: App):Context = application.applicationContext

}