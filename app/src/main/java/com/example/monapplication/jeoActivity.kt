package com.example.monapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class jeoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jeo)

        val buttonEnter : imageView = findViewById(R.id.imageView23)

        buttonEnter.setOnClickListener{
            Toast.makeText(applicationContext, "Message envoye", Toast.LENGTH_SHORT).show()
    }
}