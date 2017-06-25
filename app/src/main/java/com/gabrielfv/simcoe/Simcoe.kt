package com.gabrielfv.simcoe

import android.app.Application
import android.arch.persistence.room.Room
import com.github.salomonbrys.kodein.*

/**
 * @author gabriel on 6/15/17.
 */
class Simcoe : Application() {

    companion object {
        var database: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        Simcoe.database = Room.databaseBuilder(this, AppDatabase::class.java, "SimcoeDatabase")
                .allowMainThreadQueries()
                .build()
    }
}