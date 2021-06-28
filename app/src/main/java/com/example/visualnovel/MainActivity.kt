package com.example.visualnovel


import android.R
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.example.visualnovel.databinding.ActivityMainBinding
import java.net.URI


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val beginButton = binding.beginButton
        beginButton.setOnClickListener(){
            openMainActivity2()
        }

    }
    private fun openMainActivity2(){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}

