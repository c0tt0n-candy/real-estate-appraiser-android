package io.c0tt0n.realestateappraiser.ui.base

import android.support.annotation.IdRes
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity : DaggerAppCompatActivity() {

    protected fun addFragment(@IdRes containerViewId: Int, fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .add(containerViewId, fragment)
            .commit()
    }

    protected fun showDialogFragment(dialogFragment: DialogFragment, tag: String) =
        dialogFragment.show(supportFragmentManager, tag)
}