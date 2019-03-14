package io.c0tt0n.realestateappraiser.ui.standards

import javax.inject.Inject

class StandardsPresenter @Inject constructor() : StandardsContract.Presenter {

    private var view: StandardsContract.View? = null

    override fun takeView(view: StandardsContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
    }
}
