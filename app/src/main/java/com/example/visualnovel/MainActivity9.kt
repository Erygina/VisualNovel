package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main9)

        val lateButton = findViewById<Button>(R.id.lateButton)
        lateButton.setOnClickListener(){
            openMainActivity14()
        }

    }

    private fun openMainActivity14(){
        val intent = Intent(this, MainActivity14::class.java)
        startActivity(intent)
    }



}