package io.c0tt0n.realestateappraiser.ui.main

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import io.c0tt0n.realestateappraiser.R

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, MainFragment.newInstance())
        }
    }
}
