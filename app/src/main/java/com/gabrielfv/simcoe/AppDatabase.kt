package com.gabrielfv.simcoe

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.gabrielfv.simcoe.models.Beer
import com.gabrielfv.simcoe.models.dao.BeerDao

/**
 * @author by gabriel on 6/25/17.
 */

@Database(entities = arrayOf(Beer::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun beerDao(): BeerDao
}