package com.sagen.sample.di.modules

import com.sagen.sample.SampleApplication
import com.sagen.sample.data.local.DatabaseService
import com.sagen.sample.data.remote.NetworkService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val sampleApplication: SampleApplication) {


    @Singleton
    @Provides
    fun provideNetworkService(): NetworkService {
        return NetworkService(sampleApplication,"abc")
    }

    @Singleton
    @Provides
    fun provideDatabaseService(): DatabaseService {
        return DatabaseService(sampleApplication,"xyz",1)
    }

}