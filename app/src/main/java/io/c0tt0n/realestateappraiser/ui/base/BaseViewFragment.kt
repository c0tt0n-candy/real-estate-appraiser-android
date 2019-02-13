package io.c0tt0n.realestateappraiser.ui.base

import android.os.Bundle
import javax.inject.Inject

abstract class BaseViewFragment<T : BaseContract.Presenter> : BaseFragment(), BaseContract.View {

    @Inject
    protected lateinit var presenter: T

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        presenter.onStart(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        presenter.onSaveInsatanceState(outState)
    }

    override fun onDestroyView() {
        presenter.onDestroy()
        super.onDestroyView()
    }
}
