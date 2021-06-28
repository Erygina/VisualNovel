package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main3)

        val offerTextView3 = findViewById<TextView>(R.id.usernameTextView)
        val intent: Intent
        intent = getIntent()
        val username: String
        username = intent.getStringExtra("username").toString()

        offerTextView3.setText(username)

        val runButton = findViewById<Button>(R.id.runButton)
        runButton.setOnClickListener(){
            openMainActivity4()
        }

        val hikeButton = findViewById<Button>(R.id.hikeButton)
        hikeButton.setOnClickListener(){
            openMainActivity5()
        }

        val fieldButton = findViewById<Button>(R.id.fieldButton)
        fieldButton.setOnClickListener(){
            openMainActivity6()
        }
    }

    private fun openMainActivity4(){
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }

    private fun openMainActivity5(){
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }

    private fun openMainActivity6(){
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
    }

}