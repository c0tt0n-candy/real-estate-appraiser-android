package io.c0tt0n.realestateappraiser.ui.main

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import io.c0tt0n.realestateappraiser.R
import io.c0tt0n.realestateappraiser.util.replaceFragment
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var fragment: MainFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_act)

        supportFragmentManager.findFragmentById(R.id.fragment_container) as MainFragment? ?: run {
            replaceFragment(R.id.fragment_container, fragment)
        }
    }
}
