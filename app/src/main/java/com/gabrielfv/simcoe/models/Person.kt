package com.gabrielfv.simcoe.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable

/**
 * @author gabriel on 6/16/17.
 */

@Entity
data class Person(
        @PrimaryKey(autoGenerate = true) var id: Long = 0L,
        var name: String = "",
        var score: Int = 0
) : Serializable