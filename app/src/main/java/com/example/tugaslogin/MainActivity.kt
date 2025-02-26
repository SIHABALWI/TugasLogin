package com.example.tugaslogin

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        val tvHello = findViewById<TextView>(R.id.tvHello)

        val email = intent.getStringExtra("EMAIL")
        val username = intent.getStringExtra("USERNAME")

        tvWelcome.text = "Welcome $email"
        tvHello.text = "Hello $username"

        Log.d("MainActivity", "email: $email")
    }
}