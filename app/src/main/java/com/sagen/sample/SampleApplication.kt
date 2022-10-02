package com.sagen.sample

import android.app.Application
import android.util.Log
import com.sagen.sample.data.local.DatabaseService
import com.sagen.sample.data.remote.NetworkService
import com.sagen.sample.di.component.DaggerApplicationComponent
import com.sagen.sample.di.modules.ApplicationModule
import javax.inject.Inject

class SampleApplication : Application() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var databaseService2: DatabaseService
    override fun onCreate() {
        super.onCreate()

        DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
            .inject(this)

        Log.d("DEBUG", networkService.toString())
    }
}