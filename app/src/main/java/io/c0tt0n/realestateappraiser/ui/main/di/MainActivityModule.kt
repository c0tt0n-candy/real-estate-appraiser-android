package io.c0tt0n.realestateappraiser.ui.main.di

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import io.c0tt0n.realestateappraiser.di.scope.FragmentScope
import io.c0tt0n.realestateappraiser.ui.main.MainContract
import io.c0tt0n.realestateappraiser.ui.main.MainFragment
import io.c0tt0n.realestateappraiser.ui.main.MainPresenter

@Module
abstract class MainActivityModule {

    @ActivityScope
    @Binds
    abstract fun bindMainPresenter(presenter: MainPresenter): MainContract.Presenter

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment
}
