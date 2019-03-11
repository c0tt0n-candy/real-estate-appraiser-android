package io.c0tt0n.realestateappraiser.util

import androidx.annotation.IdRes
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

fun AppCompatActivity.addFragment(@IdRes containerViewId: Int, fragment: Fragment) {
    supportFragmentManager.transact {
        add(containerViewId, fragment)
    }
}

fun AppCompatActivity.replaceFragment(@IdRes containerViewId: Int, fragment: Fragment) {
    supportFragmentManager.transact {
        replace(containerViewId, fragment)
    }
}

fun AppCompatActivity.setupActionBar(@IdRes toolbarId: Int, action: ActionBar.() -> Unit) {
    setSupportActionBar(findViewById(toolbarId))
    supportActionBar?.run {
        action()
    }
}

private inline fun FragmentManager.transact(action: FragmentTransaction.() -> Unit) {
    beginTransaction().apply {
        action()
    }.commit()
}
