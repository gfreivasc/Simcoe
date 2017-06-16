package com.gabrielfv.simcoe.views.personForm

import com.gabrielfv.simcoe.db.PeopleDao
import com.gabrielfv.simcoe.models.Person
import javax.inject.Inject

/**
 * Created by gabriel on 6/16/17.
 */
class PersonFormViewModel @Inject constructor(val peopleDao: PeopleDao) {

    fun savePerson(person: Person) {
        if (person.id == 0L) {
            peopleDao.insertPerson(person)
        }
        else {
            peopleDao.updatePerson(person)
        }
    }

    fun deletePerson(person: Person) {
        peopleDao.deletePerson(person)
    }
}