package org.kikermo.ui.board

import android.os.Bundle
import org.kikermo.ui.R
import org.kikermo.ui.R2
import org.kikermo.ui.base.BaseActivity
import org.kikermo.ui.base.BaseLayout

@BaseLayout(R2.layout.activity_board)
class BoardActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)
    }
}
