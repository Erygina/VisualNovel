package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main4)

        val filmButton = findViewById<Button>(R.id.filmButton)
        filmButton.setOnClickListener(){
            openMainActivity7()
        }

        val halloweenButton = findViewById<Button>(R.id.halloweenButton)
        halloweenButton.setOnClickListener(){
            openMainActivity8()
        }

    }

    private fun openMainActivity7(){
        val intent = Intent(this, MainActivity7::class.java)
        startActivity(intent)
    }

    private fun openMainActivity8(){
        val intent = Intent(this, MainActivity8::class.java)
        startActivity(intent)
    }

}