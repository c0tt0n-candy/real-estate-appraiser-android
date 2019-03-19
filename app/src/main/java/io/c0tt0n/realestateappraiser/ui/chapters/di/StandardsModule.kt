package io.c0tt0n.realestateappraiser.ui.chapters.di

import dagger.Module
import dagger.Provides
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import io.c0tt0n.realestateappraiser.ui.chapters.StandardsContract
import io.c0tt0n.realestateappraiser.ui.chapters.StandardsPresenter

@Module
class StandardsModule {

    @ActivityScope
    @Provides
    fun provideStandardsPresenter(): StandardsContract.Presenter {
        return StandardsPresenter()
    }
}
