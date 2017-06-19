package com.gabrielfv.simcoe.di

import android.app.Activity
import com.gabrielfv.simcoe.views.listPeople.ListPeopleActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by gabriel on 6/19/17.
 */

@Module
abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(ListPeopleActivity::class)
    abstract fun bindListPeopleActivity(): AndroidInjector.Factory<out Activity>
}