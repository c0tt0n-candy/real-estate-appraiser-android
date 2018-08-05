package io.c0tt0n.realestateappraiser.ui.base

import android.os.Bundle

interface BaseContract {

    interface View

    interface Presenter {

        fun onStart(savedInstanceState: Bundle?) = Unit

        fun onResume() = Unit

        fun onPause() = Unit

        fun onSaveInsatanceState(outState: Bundle) = Unit

        fun onDestroy() = Unit
    }
}