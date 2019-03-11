package io.c0tt0n.realestateappraiser.ui.main

import io.c0tt0n.realestateappraiser.ui.BaseContract

interface MainContract {

    interface View : BaseContract.View<Presenter>

    interface Presenter : BaseContract.Presenter<View>
}