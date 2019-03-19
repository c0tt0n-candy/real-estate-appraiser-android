package io.c0tt0n.realestateappraiser.ui.main

import javax.inject.Inject

class MainPresenter @Inject constructor() : MainContract.Presenter {

    private var view: MainContract.View? = null

    override fun takeView(view: MainContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
    }

    override fun onClickChapters() {
        view?.navigateToChapters()
    }

    override fun onClickFavorites() {
        view?.navigateToFavorites()
    }

    override fun onClickAbout() {
        view?.navigateToAbout()
    }
}
