package io.c0tt0n.realestateappraiser.ui.standards.di

import dagger.Module
import dagger.Provides
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import io.c0tt0n.realestateappraiser.ui.standards.StandardsContract
import io.c0tt0n.realestateappraiser.ui.standards.StandardsPresenter

@Module
class StandardsModule {

    @ActivityScope
    @Provides
    fun provideStandardsPresenter(): StandardsContract.Presenter {
        return StandardsPresenter()
    }
}
