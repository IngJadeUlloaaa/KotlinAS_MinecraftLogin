package com.ingjadeulloaaa.minecreft_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

//        Btn Return
        val btnReturn = findViewById<FloatingActionButton>(R.id.btnReturn)
        btnReturn.setOnClickListener {
            returnLogin()
        }
    }

    private fun returnLogin() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}