package io.c0tt0n.realestateappraiser.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.c0tt0n.realestateappraiser.R
import io.c0tt0n.realestateappraiser.ui.base.BaseFragment

class MainFragment : BaseFragment() {

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}
