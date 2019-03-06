package io.c0tt0n.realestateappraiser.ui.base

import android.app.Dialog
import android.os.Bundle
import dagger.android.support.DaggerAppCompatDialogFragment
import io.c0tt0n.realestateappraiser.R

abstract class BaseFragment : DaggerAppCompatDialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        setStyle(DaggerAppCompatDialogFragment.STYLE_NORMAL, R.style.Theme_AppCompat_Dialog_MinWidth)
        return super.onCreateDialog(savedInstanceState)
    }
}
