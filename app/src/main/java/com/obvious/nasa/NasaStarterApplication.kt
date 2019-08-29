package com.obvious.nasa

import android.app.Application
import android.content.Context
import com.obvious.nasa.injection.component.AppComponent
import com.obvious.nasa.injection.component.DaggerAppComponent
import com.obvious.nasa.injection.module.AppModule
import com.obvious.nasa.injection.module.NetworkModule
import timber.log.Timber

class NasaStarterApplication  : Application(){


    private var appComponent: AppComponent? = null

    companion object {
        operator fun get(context: Context): NasaStarterApplication {
            return context.applicationContext as NasaStarterApplication
        }
    }

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())

        }
    }

    // Needed to replace the component with a test specific one
    var component: AppComponent
        get() {
            if (appComponent == null) {
                appComponent = DaggerAppComponent.builder()
                    .appModule(AppModule(this))
                    .networkModule(NetworkModule(this))
                    .build()
            }
            return appComponent as AppComponent
        }
        set(appComponent) {
            this.appComponent = appComponent
        }
}