package org.kikermo.ui.base

import android.support.annotation.LayoutRes


@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class BaseLayout(@LayoutRes val value: Int)
