package com.gabrielfv.simcoe.di

import android.app.Application
import android.content.Context
import com.gabrielfv.simcoe.views.listPeople.ListPeopleActivity
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by gabriel on 6/19/17.
 */

@Module(subcomponents = arrayOf(ListPeopleActivity::class))
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application
    }
}