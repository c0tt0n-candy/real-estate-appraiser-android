package io.c0tt0n.realestateappraiser

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import io.c0tt0n.realestateappraiser.di.component.DaggerApplicationComponent

class AppraiserApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder()
            .application(this)
            .build()
    }

}