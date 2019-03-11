package io.c0tt0n.realestateappraiser.ui

interface BaseContract {

    interface View<T>

    interface Presenter<T> {

        fun takeView(view: T)

        fun dropView()
    }
}
