package com.example.cumpot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val photo1: ImageView = findViewById(R.id.imageView)
        photo1.setImageResource(R.drawable.photo_2022_10_25_19_28_45)
    }
}