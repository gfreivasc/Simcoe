package com.gabrielfv.simcoe

import android.app.Application

/**
 * Created by gabriel on 6/15/17.
 */
class Simcoe : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}