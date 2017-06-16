package com.gabrielfv.simcoe

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import com.gabrielfv.simcoe.db.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by gabriel on 6/15/17.
 */

@Module
class AppModule(val app: Application) {
    @Provides
    @Singleton
    fun provideApp() = app;

    @Provides
    fun provideAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "simcoe-users")
                    .allowMainThreadQueries()
                    .build()

    @Provides
    fun providePeopleDao(db: AppDatabase) = db.peopleDao()
}