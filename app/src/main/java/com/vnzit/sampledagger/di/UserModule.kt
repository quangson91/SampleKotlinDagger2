package com.vnzit.sampledagger.di

import com.vnzit.sampledagger.model.Item
import com.vnzit.sampledagger.repository.Api

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * Created by quangson8128 on 2/15/16.
 */
@Module
class UserModule {

    @Provides
    @PerActivity
    internal fun provideApi(): Api {
        return Api()
    }

    @Provides
    @PerActivity
    internal fun provideItem(): Item {
        return Item("title", "content")
    }
}
