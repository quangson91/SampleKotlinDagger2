package com.vnzit.sampledagger.ui.tutorial

import android.content.SharedPreferences

import com.vnzit.sampledagger.di.PerActivity
import com.vnzit.sampledagger.repository.Api

import javax.inject.Inject

/**
 * Created by quangson8128 on 2/15/16.
 */
@PerActivity
class TutorialPresenter
@Inject
constructor(val pref: SharedPreferences, val api: Api) {

    fun write(key: String, msg: String) {
        pref.edit().putString(key, msg).commit()
    }

    fun read(key: String): String {
        return pref.getString(key, "")
    }
}
