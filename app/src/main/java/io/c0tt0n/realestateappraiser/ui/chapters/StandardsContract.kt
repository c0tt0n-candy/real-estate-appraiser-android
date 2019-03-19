package io.c0tt0n.realestateappraiser.ui.chapters

import io.c0tt0n.realestateappraiser.ui.BaseContract

interface StandardsContract {

    interface View : BaseContract.View<Presenter>

    interface Presenter : BaseContract.Presenter<View>
}
