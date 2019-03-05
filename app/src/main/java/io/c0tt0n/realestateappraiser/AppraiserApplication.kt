package io.c0tt0n.realestateappraiser

import butterknife.ButterKnife
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import io.c0tt0n.realestateappraiser.di.component.DaggerApplicationComponent

class AppraiserApplication : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()

        // set logging for ButterKnife
        ButterKnife.setDebug(BuildConfig.DEBUG)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }
}
