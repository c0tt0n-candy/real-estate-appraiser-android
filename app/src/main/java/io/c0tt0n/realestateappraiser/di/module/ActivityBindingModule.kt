package io.c0tt0n.realestateappraiser.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import io.c0tt0n.realestateappraiser.ui.main.MainActivity
import io.c0tt0n.realestateappraiser.ui.main.di.MainActivityModule
import io.c0tt0n.realestateappraiser.ui.standards.StandardsActivity
import io.c0tt0n.realestateappraiser.ui.standards.di.StandardsActivityModule

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun contributeMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [StandardsActivityModule::class])
    abstract fun contributeStandardsActivity(): StandardsActivity
}
