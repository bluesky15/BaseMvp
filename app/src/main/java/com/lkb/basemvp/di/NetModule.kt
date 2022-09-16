package com.lkb.basemvp.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.lkb.basemvp.ApiService
import com.lkb.basemvp.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
internal class NetModule {

    @Provides
    @Singleton
    fun provideGson(): Gson = GsonBuilder().create()


    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
           //builder.addInterceptor()
        if(BuildConfig.DEBUG){
            //builder.addInterceptor()
        }
        return builder.build()
    }


    @Singleton
    @Provides
    fun provideRetrofitApiService(gson: Gson, okHttpClient: OkHttpClient):ApiService = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl("")
        .client(okHttpClient)
        .build()
        .create(ApiService::class.java)

}