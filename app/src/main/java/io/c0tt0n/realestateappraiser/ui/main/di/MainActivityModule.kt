package io.c0tt0n.realestateappraiser.ui.main.di

import androidx.appcompat.app.AppCompatActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.c0tt0n.realestateappraiser.di.scope.ActivityScope
import io.c0tt0n.realestateappraiser.di.scope.FragmentScope
import io.c0tt0n.realestateappraiser.ui.main.MainActivity
import io.c0tt0n.realestateappraiser.ui.main.MainFragment

@Module
abstract class MainActivityModule {

    @Binds
    @ActivityScope
    abstract fun bindAppCompatActivity(mainActivity: MainActivity): AppCompatActivity

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment
}
