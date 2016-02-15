package com.vnzit.sampledagger.di

import android.app.Activity

import dagger.Module
import dagger.Provides

/**
 * Created by quangson8128 on 2/15/16.
 */
@Module
class ActivityModule(private val activity: Activity) {

    @Provides @PerActivity fun activity(): Activity {
        return this.activity
    }
}
