package com.gabrielfv.simcoe.views.beerList

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ArrayAdapter
import com.gabrielfv.simcoe.R
import com.gabrielfv.simcoe.Simcoe
import com.gabrielfv.simcoe.models.Beer
import com.github.salomonbrys.kodein.android.KodeinAppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_beer_list.*

/**
 * Created by gabriel on 6/25/17.
 */
class BeerListActivity : KodeinAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_beer_list)

        fab.setOnClickListener {
            Simcoe.database?.beerDao()?.insertAll(Beer("KBS", "Imperial Stout"))
        }

        Simcoe.database?.beerDao()?.getAllBeers()
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe { beerList ->
                    peopleList.adapter = ArrayAdapter<Beer>(
                            this, android.R.layout.simple_expandable_list_item_1, beerList
                    )
                }
    }
}