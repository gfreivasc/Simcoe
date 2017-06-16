package com.gabrielfv.simcoe.db

import android.arch.persistence.room.*
import android.arch.persistence.room.OnConflictStrategy.IGNORE
import com.gabrielfv.simcoe.models.Person
import io.reactivex.Observable

/**
 * @author gabriel on 6/16/17.
 */

@Dao
interface PeopleDao {
    @Insert(onConflict = IGNORE)
    fun insertPerson(person: Person)

    @Update
    fun updatePerson(person: Person)

    @Delete
    fun deletePerson(vararg people: Person)

    @Query("SELECT * FROM Person ORDER BY firstName")
    fun listAll(): Observable<List<Person>>
}