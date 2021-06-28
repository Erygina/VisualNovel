package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main11)

        val beautifulSuitButton = findViewById<Button>(R.id.beautifulSuitButton)
        beautifulSuitButton.setOnClickListener(){
            openMainActivity12()
        }

        val uglySuitButton = findViewById<Button>(R.id.uglySuitButton)
        uglySuitButton.setOnClickListener(){
            openMainActivity13()
        }

    }

    private fun openMainActivity12(){
        val intent = Intent(this, MainActivity12::class.java)
        startActivity(intent)
    }

    private fun openMainActivity13(){
        val intent = Intent(this, MainActivity13::class.java)
        startActivity(intent)
    }

}