package io.c0tt0n.realestateappraiser.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import io.c0tt0n.realestateappraiser.R
import javax.inject.Inject

class MainFragment @Inject constructor() : DaggerFragment(), MainContract.View {

    @Inject
    lateinit var presenter: MainContract.Presenter

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_frag, container, false)
    }

    override fun onResume() {
        super.onResume()
        presenter.takeView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.dropView()
    }
}
