package com.gabrielfv.simcoe

import android.app.Application
import com.gabrielfv.simcoe.di.AppComponent
import com.gabrielfv.simcoe.di.AppModule

/**
 * @author gabriel on 6/15/17.
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