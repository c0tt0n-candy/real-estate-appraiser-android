package io.c0tt0n.realestateappraiser.ui.base

import android.app.Dialog
import android.os.Bundle
import butterknife.ButterKnife
import butterknife.Unbinder
import dagger.android.support.DaggerAppCompatDialogFragment
import io.c0tt0n.realestateappraiser.R

abstract class BaseFragment : DaggerAppCompatDialogFragment() {

    private var viewUnbinder: Unbinder? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        setStyle(DaggerAppCompatDialogFragment.STYLE_NORMAL, R.style.Theme_AppCompat_Dialog_MinWidth)
        return super.onCreateDialog(savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        viewUnbinder = view?.let { ButterKnife.bind(this, it) }
    }

    override fun onDestroyView() {
        viewUnbinder?.unbind()
        super.onDestroyView()
    }
}