package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat.startActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val username =  findViewById<EditText>(R.id.nameEditText)
        val confirmButton = findViewById<Button>(R.id.confirmButton)
        confirmButton.setOnClickListener(){
            openMainActivity3(username)
        }

    }

    private fun openMainActivity3(username : EditText){
        val intent = Intent(this, MainActivity3::class.java)
        intent.putExtra("username", username.getText().toString())
        startActivity(intent)
    }
}




