package io.c0tt0n.realestateappraiser.ui.chapters.di

import dagger.Module
import dagger.Provides
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import io.c0tt0n.realestateappraiser.ui.chapters.ChaptersContract
import io.c0tt0n.realestateappraiser.ui.chapters.ChaptersPresenter

@Module
class ChaptersModule {

    @ActivityScope
    @Provides
    fun provideChaptersPresenter(): ChaptersContract.Presenter {
        return ChaptersPresenter()
    }
}
