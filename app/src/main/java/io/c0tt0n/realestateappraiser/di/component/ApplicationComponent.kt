package io.c0tt0n.realestateappraiser.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import io.c0tt0n.realestateappraiser.AppraiserApplication
import io.c0tt0n.realestateappraiser.di.builder.ActivityBuildingModule
import io.c0tt0n.realestateappraiser.di.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class), (ApplicationModule::class), ActivityBuildingModule::class])
interface ApplicationComponent : AndroidInjector<AppraiserApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }
}
