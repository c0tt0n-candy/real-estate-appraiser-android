package io.c0tt0n.realestateappraiser.di.component

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import io.c0tt0n.realestateappraiser.AppraiserApplication
import io.c0tt0n.realestateappraiser.di.module.ActivityBindingModule
import io.c0tt0n.realestateappraiser.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class), (ApplicationModule::class), ActivityBindingModule::class])
interface ApplicationComponent : AndroidInjector<AppraiserApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<AppraiserApplication>()
}
