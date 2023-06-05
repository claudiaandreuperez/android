package com.example.treball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.graphics.BitmapFactory
import androidx.navigation.ActivityNavigatorDestinationBuilder
import java.io.File


class Dades_Jugadors : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dades_jugadors)
        val foto = findViewById<ImageView>(R.id.imatge)
        val edittext1 = findViewById<TextView>(R.id.uno1)
        val edittext2 = findViewById<TextView>(R.id.dos)
        val edittext3 = findViewById<TextView>(R.id.tres)
        val edittext4 = findViewById<TextView>(R.id.quatro)
        val edittext5 = findViewById<TextView>(R.id.cinco)
        val fotos = intent.getStringExtra("foto")
        val num1 = intent.getStringExtra("nom")
        val num2 = intent.getStringExtra("edat")
        val num3 = intent.getStringExtra("altura")
        val num4 = intent.getStringExtra("pes")
        val num5 = intent.getStringExtra("equip")
        val  res = resources.getIdentifier(fotos+".png", "drawable", applicationContext.packageName)
        foto.setImageResource(res)
        edittext1.text = num1
        edittext2.text = num2
        edittext3.text = num3
        edittext4.text = num4
        edittext5.text = num5


        val buton = findViewById<Button>(R.id.back)

        if (num5.equals("España")){
            buton.setOnClickListener {
                val intento1 = Intent(this, MainActivity::class.java)
                startActivity(intento1)
            }
        } else if (num5.equals("Japon")){
            buton.setOnClickListener {
                val intento1 = Intent(this, MainActivity2::class.java)
                startActivity(intento1)
            }
        }else if (num5.equals("Brazil")){
            buton.setOnClickListener {
                val intento1 = Intent(this, MainActivity3::class.java)
                startActivity(intento1)
            }
        }





    }
}