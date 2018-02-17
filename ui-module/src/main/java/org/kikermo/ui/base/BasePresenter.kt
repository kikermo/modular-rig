package org.kikermo.ui.base

class BasePresenter<VIEW> {
    @Inject var view: VIEW

    fun onBindView()
}