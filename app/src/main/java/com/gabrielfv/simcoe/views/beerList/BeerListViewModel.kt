package com.gabrielfv.simcoe.views.beerList

import com.gabrielfv.simcoe.AppDatabase
import com.gabrielfv.simcoe.Simcoe
import com.gabrielfv.simcoe.models.Beer
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.instance
import io.reactivex.Flowable

/**
 * Created by gabriel on 6/25/17.
 */
class BeerListViewModel(private val kodein: Kodein) {
    private val db: AppDatabase = kodein.instance()

    fun getBeers(): Flowable<List<Beer>> {
        return db.beerDao().getAllBeers()
    }

    fun save(beer: Beer) {
        db.beerDao().insertAll(beer)
    }
}