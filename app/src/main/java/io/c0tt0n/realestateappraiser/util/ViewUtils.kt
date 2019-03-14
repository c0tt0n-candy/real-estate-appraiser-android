package io.c0tt0n.realestateappraiser.util

import android.view.View

fun View.setOnSingleClickListener(listener: (view: View) -> Unit) {
    this.setOnClickListener { v ->
        v.isClickable = false
        postDelayed({ v.isClickable = true }, 500L)
        listener.invoke(v)
    }
}
