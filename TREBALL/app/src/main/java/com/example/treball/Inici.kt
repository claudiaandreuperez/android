package com.example.treball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button



class Inici : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inici)
        val buton = findViewById<Button>(R.id.btinici)
        val buton2 = findViewById<Button>(R.id.btinici2)
        val buton3 = findViewById<Button>(R.id.btinici3)
        buton.setOnClickListener {
            val intento1 = Intent(this, MainActivity::class.java)
            startActivity(intento1)
        }
        buton2.setOnClickListener {
            val intento1 = Intent(this, MainActivity2::class.java)
            startActivity(intento1)
        }
        buton3.setOnClickListener {
            val intento1 = Intent(this, MainActivity3::class.java)
            startActivity(intento1)
        }

    }


}