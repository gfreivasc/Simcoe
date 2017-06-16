package com.gabrielfv.simcoe.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.gabrielfv.simcoe.models.Person

/**
 * Created by gabriel on 6/16/17.
 */

@Database(entities = arrayOf(Person::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun peopleDao(): PeopleDao
}