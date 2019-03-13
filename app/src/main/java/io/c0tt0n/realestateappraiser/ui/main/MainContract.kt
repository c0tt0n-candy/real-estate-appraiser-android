package io.c0tt0n.realestateappraiser.ui.main

import io.c0tt0n.realestateappraiser.ui.BaseContract

interface MainContract {

    interface View : BaseContract.View<Presenter> {
        fun navigateToStandards()
        fun navigateToFavorites()
        fun navigateToAbout()
    }

    interface Presenter : BaseContract.Presenter<View> {
        fun onClickStandards()
        fun onClickFavorites()
        fun onClickAbout()
    }
}
