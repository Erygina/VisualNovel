package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main7)

        val likeButton = findViewById<Button>(R.id.likeButton)
        likeButton.setOnClickListener(){
            openMainActivity9()
        }

        val notVeryButton = findViewById<Button>(R.id.notVeryButton)
        notVeryButton.setOnClickListener(){
            openMainActivity10()
        }

    }

    private fun openMainActivity9(){
        val intent = Intent(this, MainActivity9::class.java)
        startActivity(intent)
    }

    private fun openMainActivity10(){
        val intent = Intent(this, MainActivity10::class.java)
        startActivity(intent)
    }

}