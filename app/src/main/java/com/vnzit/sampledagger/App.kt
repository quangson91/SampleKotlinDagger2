package com.vnzit.sampledagger

import android.app.Application
import android.content.Context

import com.vnzit.sampledagger.di.AppComponent
import com.vnzit.sampledagger.di.AppModule
import com.vnzit.sampledagger.di.DaggerAppComponent

/**
 * Created by quangson8128 on 2/15/16.
 */
class App : Application() {
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    companion object {
        operator fun get(context: Context): App {
            return context.applicationContext as App
        }
    }
}
