package io.c0tt0n.realestateappraiser.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import io.c0tt0n.realestateappraiser.ui.main.MainActivity
import io.c0tt0n.realestateappraiser.ui.main.di.MainActivityModule

@Module
abstract class ActivityBuildingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun contributeMainActivity(): MainActivity

}