package io.c0tt0n.realestateappraiser.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import io.c0tt0n.realestateappraiser.ui.main.MainActivity
import io.c0tt0n.realestateappraiser.ui.main.di.MainModule
import io.c0tt0n.realestateappraiser.ui.main.di.MainViewModule
import io.c0tt0n.realestateappraiser.ui.standards.StandardsActivity
import io.c0tt0n.realestateappraiser.ui.standards.di.StandardsModule
import io.c0tt0n.realestateappraiser.ui.standards.di.StandardsViewModule

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class, MainViewModule::class])
    abstract fun contributeMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [StandardsModule::class, StandardsViewModule::class])
    abstract fun contributeStandardsActivity(): StandardsActivity
}
