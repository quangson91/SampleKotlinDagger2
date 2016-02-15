package com.vnzit.sampledagger.di

import android.app.Activity

import dagger.Component

/**
 * Created by quangson8128 on 2/15/16.
 */
@PerActivity
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun activity(): Activity
}
