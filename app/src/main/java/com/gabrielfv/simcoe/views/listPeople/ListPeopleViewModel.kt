package com.gabrielfv.simcoe.views.listPeople

import com.gabrielfv.simcoe.db.PeopleDao
import com.gabrielfv.simcoe.models.Person
import io.reactivex.Observable
import javax.inject.Inject

/**
 * @author gabriel on 6/16/17.
 */
class ListPeopleViewModel @Inject constructor(val peopleDao: PeopleDao) {

    val observablePeople: Observable<List<Person>> by lazy {
        peopleDao.listAll()
    }
}