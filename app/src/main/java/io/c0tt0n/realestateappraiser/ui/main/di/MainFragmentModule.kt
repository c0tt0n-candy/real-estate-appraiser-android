package io.c0tt0n.realestateappraiser.ui.main.di

import android.support.v4.app.Fragment
import dagger.Binds
import dagger.Module
import io.c0tt0n.realestateappraiser.di.scope.FragmentScope
import io.c0tt0n.realestateappraiser.ui.base.di.BaseFragmentModule
import io.c0tt0n.realestateappraiser.ui.main.MainFragment
import javax.inject.Named

@Module(includes = [BaseFragmentModule::class])
abstract class MainFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @FragmentScope
    abstract fun bindFragment(mainFragment: MainFragment): Fragment

}