package io.c0tt0n.realestateappraiser.ui.chapters.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.c0tt0n.realestateappraiser.di.scope.FragmentScope
import io.c0tt0n.realestateappraiser.ui.chapters.StandardsFragment

@Module
abstract class StandardsViewModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeStandardsFragment(): StandardsFragment
}
