package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main13)

        val lateButton13 = findViewById<Button>(R.id.lateButton13)
        lateButton13.setOnClickListener() {
            openMainActivity14()
        }

    }

    private fun openMainActivity14() {
        val intent = Intent(this, MainActivity14::class.java)
        startActivity(intent)
    }
}