package com.ingjadeulloaaa.minecreft_login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Button Principal View
        val btnPrincipalSignIn = findViewById<AppCompatButton>(R.id.btnSignInPrincipal)
        btnPrincipalSignIn.setOnClickListener {
            navigateToLoginActivity()
        }

//        Text Create Account if no Exist
        val textCreateAnAccount = findViewById<TextView>(R.id.textCreateAnAccount)
        textCreateAnAccount.setOnClickListener {
            navigateToCreateAccount()
        }
    }

    //    Function to Navigate to Login
    private fun navigateToLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    //     This Function is to Create an Account
    private fun navigateToCreateAccount() {
        val intent = Intent(this, CreateAccountActivity::class.java)
        startActivity(intent)
    }
}