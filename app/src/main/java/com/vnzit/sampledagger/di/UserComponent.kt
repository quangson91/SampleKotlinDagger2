package com.vnzit.sampledagger.di

import com.vnzit.sampledagger.ui.tutorial.TutorialActivity

import dagger.Component

/**
 * Created by quangson8128 on 2/15/16.
 */
@PerActivity
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class, UserModule::class))
interface UserComponent : ActivityComponent {
    fun inject(tutorialActivity: TutorialActivity)
}
