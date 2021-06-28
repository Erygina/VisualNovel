package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main8)

        val filmButton4 = findViewById<Button>(R.id.filmButton4)
        filmButton4.setOnClickListener(){
            openMainActivity7()
        }

        val suitButton = findViewById<Button>(R.id.suitButton)
        suitButton.setOnClickListener(){
            openMainActivity11()
        }

    }

    private fun openMainActivity7(){
        val intent = Intent(this, MainActivity7::class.java)
        startActivity(intent)
    }

    private fun openMainActivity11(){
        val intent = Intent(this, MainActivity11::class.java)
        startActivity(intent)
    }

}