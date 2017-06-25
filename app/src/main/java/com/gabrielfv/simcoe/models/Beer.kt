package com.gabrielfv.simcoe.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable

/**
 * @author by gabriel on 6/25/17.
 */

@Entity(tableName = "beer")
data class Beer(
        var label: String = "",
        var type: String = ""
) : Serializable {
    @PrimaryKey(autoGenerate = true) val id: Long = 0L
}