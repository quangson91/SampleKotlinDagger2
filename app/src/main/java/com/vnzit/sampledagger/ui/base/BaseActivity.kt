package com.vnzit.sampledagger.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.vnzit.sampledagger.App
import com.vnzit.sampledagger.di.ActivityModule
import com.vnzit.sampledagger.di.AppComponent
import com.vnzit.sampledagger.di.HasComponent

/**
 * Created by quangson8128 on 2/15/16.
 */
abstract class BaseActivity<C> : AppCompatActivity(), HasComponent<C> {

    private var comp : C? = null
    override val component: C
        get() = comp!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        comp = initializeInjector()
    }

    protected abstract fun initializeInjector(): C

    protected val appComponent: AppComponent
        get() = App.get(this).appComponent

    protected val activityModule: ActivityModule
        get() = ActivityModule(this)
}
