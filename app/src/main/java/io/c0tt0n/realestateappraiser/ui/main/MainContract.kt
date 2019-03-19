package io.c0tt0n.realestateappraiser.ui.main

import io.c0tt0n.realestateappraiser.ui.BaseContract

interface MainContract {

    interface View : BaseContract.View<Presenter> {
        fun navigateToChapters()
        fun navigateToFavorites()
        fun navigateToAbout()
    }

    interface Presenter : BaseContract.Presenter<View> {
        fun onClickChapters()
        fun onClickFavorites()
        fun onClickAbout()
    }
}
