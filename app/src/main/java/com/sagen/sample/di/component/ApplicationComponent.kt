package com.sagen.sample.di.component

import com.sagen.sample.SampleApplication
import com.sagen.sample.di.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(sampleApplication: SampleApplication)
}