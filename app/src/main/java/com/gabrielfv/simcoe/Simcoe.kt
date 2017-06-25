package com.gabrielfv.simcoe

import android.app.Application
import android.arch.persistence.room.Room
import com.github.salomonbrys.kodein.*

/**
 * @author gabriel on 6/15/17.
 */
class Simcoe : Application(), KodeinAware {
    override val kodein: Kodein by Kodein.lazy {
    }
}