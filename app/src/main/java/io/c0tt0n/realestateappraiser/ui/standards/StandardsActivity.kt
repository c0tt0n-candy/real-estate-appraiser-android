package io.c0tt0n.realestateappraiser.ui.standards

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import dagger.android.support.DaggerAppCompatActivity
import io.c0tt0n.realestateappraiser.R
import io.c0tt0n.realestateappraiser.util.replaceFragment
import kotlinx.android.synthetic.main.standards_act.*
import javax.inject.Inject

class StandardsActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var fragment: StandardsFragment

    companion object {
        fun newInstance(context: Context?): Intent = Intent(context, StandardsActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.standards_act)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportFragmentManager.findFragmentById(R.id.fragment_container) as StandardsFragment?
                ?: run {
                    replaceFragment(R.id.fragment_container, fragment)
                }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
