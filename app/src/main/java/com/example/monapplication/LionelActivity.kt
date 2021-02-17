package com.example.monapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class LionelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lionel)

        val buttonEnter : Button = findViewById(R.id.button2)

        buttonEnter.setOnClickListener{
        Toast.makeText(applicationContext, "Message envoye", Toast.LENGTH_SHORT).show()
    }



    }

}