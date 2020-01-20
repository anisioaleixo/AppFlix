package com.anisioaleixo.appflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import kotlinx.android.synthetic.main.activity_sign_up_welcome.*

class SignUpWelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_welcome)

        siginup_welcome_btn_continue.setOnClickListener(){
            val intent = Intent(this, SiginUpActivity::class.java)
            startActivity(intent)
        }

        //carregando barra de navegação com suporte
        setSupportActionBar(siginup_welcome_toolbar)
        supportActionBar?.title = null
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.siginup_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
