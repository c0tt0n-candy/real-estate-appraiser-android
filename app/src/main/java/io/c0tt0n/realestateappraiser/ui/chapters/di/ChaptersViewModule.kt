package io.c0tt0n.realestateappraiser.ui.chapters.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.c0tt0n.realestateappraiser.di.scope.FragmentScope
import io.c0tt0n.realestateappraiser.ui.chapters.ChaptersFragment

@Module
abstract class ChaptersViewModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeChaptersFragment(): ChaptersFragment
}
