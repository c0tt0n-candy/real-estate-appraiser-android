package io.c0tt0n.realestateappraiser.ui.main.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.c0tt0n.realestateappraiser.di.scope.FragmentScope
import io.c0tt0n.realestateappraiser.ui.main.MainFragment

@Module
abstract class MainViewModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment
}
