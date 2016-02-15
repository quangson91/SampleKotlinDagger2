package com.vnzit.sampledagger.ui.base

import android.support.v4.app.Fragment

import com.vnzit.sampledagger.di.HasComponent

/**
 * Created by quangson8128 on 2/15/16.
 */
abstract class BaseFragment : Fragment() {

    @SuppressWarnings("unchecked")
    protected fun <C> getComponent(componentType: Class<C>): C {
        return componentType.cast((activity as HasComponent<C>).component)
    }
}
