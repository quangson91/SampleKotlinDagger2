package com.vnzit.sampledagger.di

import java.lang.annotation.Retention

import javax.inject.Scope

import java.lang.annotation.RetentionPolicy.RUNTIME

/**
 * Created by quangson8128 on 2/15/16.
 */
@Scope
@Retention(RUNTIME)
annotation class PerApp
