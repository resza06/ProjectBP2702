package com.example.projectbp2702

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //instance
        val btnLogin:Button = findViewById(R.id.buttonLogin)
        //event
        btnLogin.setOnClickListener(){
            val intenHome = Intent(this, HomeActivity::class.java)
            startActivity(intenHome)
        }
    }
}