package com.gabrielfv.simcoe

import android.app.Application
import dagger.Component
import javax.inject.Singleton

/**
 * Created by gabriel on 6/15/17.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: Application)
}