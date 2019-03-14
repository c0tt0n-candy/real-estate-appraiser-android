package io.c0tt0n.realestateappraiser.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import io.c0tt0n.realestateappraiser.R
import io.c0tt0n.realestateappraiser.util.setOnSingleClickListener
import kotlinx.android.synthetic.main.main_frag.*
import javax.inject.Inject

class MainFragment @Inject constructor() : DaggerFragment(), MainContract.View {

    @Inject
    lateinit var presenter: MainContract.Presenter

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        standards_card.setOnSingleClickListener { presenter.onClickStandards() }
        favorites_card.setOnSingleClickListener { presenter.onClickFavorites() }
        about_card.setOnSingleClickListener { presenter.onClickAbout() }
    }

    override fun onResume() {
        super.onResume()
        presenter.takeView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.dropView()
    }

    // [MainContract.View]
    override fun navigateToStandards() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun navigateToFavorites() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun navigateToAbout() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
