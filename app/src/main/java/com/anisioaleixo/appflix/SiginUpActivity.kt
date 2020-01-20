package com.anisioaleixo.appflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import kotlinx.android.synthetic.main.activity_sigin_up.*

class SiginUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sigin_up)

        setSupportActionBar(siginup_toolbar)
        supportActionBar?.title = null
    }


}
