package com.gabrielfv.simcoe.views.beerList

import com.gabrielfv.simcoe.Simcoe
import com.gabrielfv.simcoe.models.Beer
import io.reactivex.Flowable

/**
 * Created by gabriel on 6/25/17.
 */
class BeerListViewModel {
    fun getBeers(): Flowable<List<Beer>>? {
        return Simcoe.database?.beerDao()?.getAllBeers()
    }

    fun save(beer: Beer) {
        Simcoe.database?.beerDao()?.insertAll(beer)
    }
}