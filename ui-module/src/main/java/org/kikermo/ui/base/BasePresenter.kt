package org.kikermo.ui.base

import io.reactivex.disposables.CompositeDisposable

class BasePresenter<VIEW> {
    val compositeDisposable: CompositeDisposable = CompositeDisposable()
    var view: VIEW = null

    fun onBindView(view: VIEW) {
        this.view = view
    }

    fun onUnbindView() {
        compositeDisposable.clear()
        view = null
    }
}