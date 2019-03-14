package io.c0tt0n.realestateappraiser.ui.standards

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import io.c0tt0n.realestateappraiser.R
import io.c0tt0n.realestateappraiser.util.replaceFragment
import javax.inject.Inject

class StandardsActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var fragment: StandardsFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standards_act)

        supportFragmentManager.findFragmentById(R.id.fragment_container) as StandardsFragment?
                ?: run {
                    replaceFragment(R.id.fragment_container, fragment)
                }
    }
}
