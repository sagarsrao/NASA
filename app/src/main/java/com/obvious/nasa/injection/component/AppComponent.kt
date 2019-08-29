package com.obvious.nasa.injection.component

import android.app.Application
import android.content.Context

import com.obvious.nasa.injection.ApplicationContext
import com.obvious.nasa.injection.module.AppModule
import com.obvious.nasa.data.DataManager
import com.obvious.nasa.data.NASARestServiceApi

import dagger.Component

import javax.inject.Singleton


/*The below contains all the project level dependecies*/
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    @ApplicationContext
    fun context(): Context

    fun application(): Application

    fun dataManager(): DataManager

    fun factApi(): NASARestServiceApi
}
