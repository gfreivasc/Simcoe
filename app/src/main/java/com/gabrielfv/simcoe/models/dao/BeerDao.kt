package com.gabrielfv.simcoe.models.dao

import android.arch.persistence.room.*
import com.gabrielfv.simcoe.models.Beer
import io.reactivex.Flowable

/**
 * @author by gabriel on 6/25/17.
 */

@Dao
interface BeerDao {

    @Query("SELECT * FROM beer")
    fun getAllBeers(): Flowable<List<Beer>>

    @Insert
    fun insertAll(vararg beer: Beer)

    @Update
    fun update(beer: Beer)

    @Delete
    fun delete(beer: Beer)
}