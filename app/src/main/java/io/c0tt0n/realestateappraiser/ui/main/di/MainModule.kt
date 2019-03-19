package io.c0tt0n.realestateappraiser.ui.main.di

import dagger.Module
import dagger.Provides
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import io.c0tt0n.realestateappraiser.ui.main.MainContract
import io.c0tt0n.realestateappraiser.ui.main.MainPresenter

@Module
class MainModule {

    @ActivityScope
    @Provides
    fun provideMainPresenter(): MainContract.Presenter {
        return MainPresenter()
    }
}
