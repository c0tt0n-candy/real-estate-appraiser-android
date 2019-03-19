package io.c0tt0n.realestateappraiser.ui.chapters

import javax.inject.Inject

class ChaptersPresenter @Inject constructor() : ChaptersContract.Presenter {

    private var view: ChaptersContract.View? = null

    override fun takeView(view: ChaptersContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
    }
}
