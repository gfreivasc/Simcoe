package com.gabrielfv.simcoe

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by gabriel on 6/15/17.
 */

@Module
class AppModule(val app: Application) {
    @Provides @Singleton fun provideApp() = app;
}