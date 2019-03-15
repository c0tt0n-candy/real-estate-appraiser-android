package io.c0tt0n.realestateappraiser.ui.standards.di

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import io.c0tt0n.realestateappraiser.di.scope.FragmentScope
import io.c0tt0n.realestateappraiser.ui.standards.StandardsContract
import io.c0tt0n.realestateappraiser.ui.standards.StandardsFragment
import io.c0tt0n.realestateappraiser.ui.standards.StandardsPresenter

@Module
abstract class StandardsActivityModule {

    @ActivityScope
    @Binds
    abstract fun bindStandardsPresenter(presenter: StandardsPresenter): StandardsContract.Presenter

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeStandardsFragment(): StandardsFragment
}
