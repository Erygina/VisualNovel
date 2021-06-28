package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main12)

        val lateButton12 = findViewById<Button>(R.id.lateButton12)
        lateButton12.setOnClickListener(){
            openMainActivity14()
        }

    }

    private fun openMainActivity14(){
        val intent = Intent(this, MainActivity14::class.java)
        startActivity(intent)
    }

}