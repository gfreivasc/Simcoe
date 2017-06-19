package com.gabrielfv.simcoe.views.listPeople

import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by gabriel on 6/19/17.
 */

@Subcomponent(modules = arrayOf(ListPeopleModule::class))
interface ListPeopleComponent {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<ListPeopleActivity>()
}