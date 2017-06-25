package com.gabrielfv.simcoe.views.beerList

import com.gabrielfv.simcoe.Simcoe
import com.gabrielfv.simcoe.models.Beer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by gabriel on 6/25/17.
 */
class BeerListViewModel {
    fun getBeers(callback: (List<Beer>) -> Unit): Disposable? {
        return Simcoe.database?.beerDao()?.getAllBeers()
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe(callback)
    }

    fun save(beer: Beer) {
        Simcoe.database?.beerDao()?.insertAll(beer)
    }
}