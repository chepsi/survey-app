package com.chepsi.survey.app

import android.app.Application
import com.chepsi.survey.app.domain.di.myKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class SurveyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        initializeKoin()

        plantTrees()
    }

    private fun initializeKoin() {
        startKoin {
            androidContext(this@SurveyApp)
            modules(myKoinModules)
        }
    }

    private fun plantTrees() {
        Timber.plant(Timber.DebugTree())
    }
}