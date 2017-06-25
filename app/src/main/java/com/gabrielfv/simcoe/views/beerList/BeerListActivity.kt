package com.gabrielfv.simcoe.views.beerList

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.gabrielfv.simcoe.R
import com.gabrielfv.simcoe.Simcoe
import com.gabrielfv.simcoe.models.Beer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_beer_list.*

/**
 * @author by gabriel on 6/25/17.
 */
class BeerListActivity : AppCompatActivity() {
    val viewModel = BeerListViewModel()
    val disposables = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beer_list)

        fab.setOnClickListener {
            viewModel.save(Beer("KBS", "Imperial Stout"))
        }

        disposables.add(viewModel.getBeers { beers ->
            beerList.adapter = ArrayAdapter<Beer>(
                this, android.R.layout.simple_expandable_list_item_1, beers
            )
        })
    }
}