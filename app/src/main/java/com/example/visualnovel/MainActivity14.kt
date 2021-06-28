package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main14)

        val againButton = findViewById<Button>(R.id.againButton)
        againButton.setOnClickListener() {
            openMainActivity1()
        }

    }

    private fun openMainActivity1() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}