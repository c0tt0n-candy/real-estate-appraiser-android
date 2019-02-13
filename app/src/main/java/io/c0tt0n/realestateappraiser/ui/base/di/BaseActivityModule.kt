package io.c0tt0n.realestateappraiser.ui.base.di

import android.app.Activity
import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import dagger.Binds
import dagger.Module
import dagger.Provides
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import javax.inject.Named

@Module
abstract class BaseActivityModule {

    @Module
    companion object {
        private const val ACTIVITY_FRAGMENT_MANAGER = "BaseActivityModule.activityFragmentManager"

        @JvmStatic
        @Provides
        @Named(ACTIVITY_FRAGMENT_MANAGER)
        @ActivityScope
        fun provideActivityFragmentManager(activity: AppCompatActivity): FragmentManager = activity.supportFragmentManager
    }

    @Binds
    @ActivityScope
    abstract fun bindActivity(appCompatActivity: AppCompatActivity): Activity

    @Binds
    @ActivityScope
    abstract fun bindActivityContext(activity: Activity): Context
}
