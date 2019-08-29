package com.obvious.nasa.injection.module

import com.obvious.nasa.data.NASARestServiceApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton


@Module(includes = arrayOf(NetworkModule::class))
class ApiModule {

    @Provides
    @Singleton
    internal fun provideNewsApi(retrofit: Retrofit): NASARestServiceApi =
            retrofit.create(NASARestServiceApi::class.java)
}