package io.c0tt0n.realestateappraiser.ui.base

import androidx.annotation.IdRes
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
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
