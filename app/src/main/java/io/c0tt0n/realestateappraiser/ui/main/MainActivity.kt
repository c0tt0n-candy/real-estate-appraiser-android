package io.c0tt0n.realestateappraiser.ui.main

import android.os.Bundle
import io.c0tt0n.realestateappraiser.R
import io.c0tt0n.realestateappraiser.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, MainFragment.newInstance())
        }
    }
}
