package io.c0tt0n.realestateappraiser.ui.base

abstract class BasePresenter<out T : BaseContract.View>
protected constructor(protected val view: T) : BaseContract.Presenter