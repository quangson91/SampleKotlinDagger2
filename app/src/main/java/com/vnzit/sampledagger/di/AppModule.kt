package com.vnzit.sampledagger.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

import com.vnzit.sampledagger.repository.Api

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * Created by quangson8128 on 2/15/16.
 */
@Module
class AppModule(private val app: Application) {

    @Provides
    @Singleton
    internal fun provideAppContext(): Context {
        return this.app
    }

    @Provides
    @Singleton
    internal fun provideSharedPreferences(): SharedPreferences {
        return this.app.getSharedPreferences("global_shared", Context.MODE_PRIVATE)
    }
}
