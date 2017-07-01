package com.gabrielfv.simcoe

import android.app.Application
import android.arch.persistence.room.Room
import com.github.salomonbrys.kodein.*

/**
 * @author gabriel on 6/15/17.
 */
class Simcoe : Application(), KodeinAware {
    override val kodein by Kodein.lazy {
        bind<Simcoe>() to instance(this)
        bind<AppDatabase>() with singleton {
            Room.databaseBuilder(this@Simcoe, AppDatabase::class.java, "SimcoeDatabase")
                    .allowMainThreadQueries()
                    .build()
        }
    }
}