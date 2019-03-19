package io.c0tt0n.realestateappraiser.ui.standards.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.c0tt0n.realestateappraiser.di.scope.FragmentScope
import io.c0tt0n.realestateappraiser.ui.standards.StandardsFragment

@Module
abstract class StandardsViewModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeStandardsFragment(): StandardsFragment
}
