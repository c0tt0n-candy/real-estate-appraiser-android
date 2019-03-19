package io.c0tt0n.realestateappraiser.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import io.c0tt0n.realestateappraiser.ui.chapters.ChaptersActivity
import io.c0tt0n.realestateappraiser.ui.chapters.di.ChaptersModule
import io.c0tt0n.realestateappraiser.ui.chapters.di.ChaptersViewModule
import io.c0tt0n.realestateappraiser.ui.main.MainActivity
import io.c0tt0n.realestateappraiser.ui.main.di.MainModule
import io.c0tt0n.realestateappraiser.ui.main.di.MainViewModule

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class, MainViewModule::class])
    abstract fun contributeMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ChaptersModule::class, ChaptersViewModule::class])
    abstract fun contributeChaptersActivity(): ChaptersActivity
}
