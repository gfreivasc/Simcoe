package com.gabrielfv.simcoe.views.listPeople

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.gabrielfv.simcoe.R
import com.gabrielfv.simcoe.models.Person
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ListPeopleActivity @Inject constructor(
        val viewModel: ListPeopleViewModel) : AppCompatActivity() {

    val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinx.android.synthetic.main.activity_main.fab.setOnClickListener {
            TODO("Implement form fragment")
        }

        compositeDisposable.add(viewModel.observablePeople
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ people ->
                    kotlinx.android.synthetic.main.activity_main.peopleList.adapter = ArrayAdapter<Person>(
                            this@ListPeopleActivity,
                            android.R.layout.simple_expandable_list_item_1,
                            people
                    )

                    kotlinx.android.synthetic.main.activity_main.peopleList.setOnItemClickListener { _, _, position, _ ->
                        val person = people?.get(position)
                        if (person != null) {
                            TODO("Implement form fragment")
                        }
                    }
                }))
    }

    override fun onDestroy() {
        compositeDisposable.dispose()
        super.onDestroy()
    }
}
