package com.example.treball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class NouJugador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nou_jugador)
        val buton = findViewById<Button>(R.id.back)
        val buton5 = findViewById<Button>(R.id.enviar)
        val editText = findViewById<EditText>(R.id.nombre)
        val editText2 = findViewById<EditText>(R.id.edat)
        val editText3 = findViewById<EditText>(R.id.altura)
        val editText4 = findViewById<EditText>(R.id.pes)
        val editText5 = findViewById<EditText>(R.id.equip)

        buton.setOnClickListener {
            val intento1 = Intent(this, MainActivity::class.java)
            startActivity(intento1)
        }
        if (editText5.text.equals("España")){
            buton.setOnClickListener {
                val intento1 = Intent(this, MainActivity::class.java)
                startActivity(intento1)
            }
        } else if (editText5.text.equals("Japon")){
            buton.setOnClickListener {
                val intento1 = Intent(this, MainActivity2::class.java)
                startActivity(intento1)
            }
        }else if (editText5.text.equals("Brazil")){
            buton.setOnClickListener {
                val intento1 = Intent(this, MainActivity3::class.java)
                startActivity(intento1)
            }
        }
        buton5.setOnClickListener {
            if (editText.text.isEmpty() && editText2.text.isEmpty() && editText3.text.isEmpty() && editText4.text.isEmpty() && editText5.text.isEmpty()){
                Toast.makeText(this, "Rellenar campos vacios", Toast.LENGTH_SHORT).show()
            }else{
                val nom = editText.text.toString()
                val edad = editText2.text.toString()
                val altura = editText3.text.toString()
                val pes = editText4.text.toString()
                val equip = editText5.text.toString()
                //jugadors_españa.add(Jugador(nom,edad,altura,pes, equip))
                val cosa : Intent = Intent(applicationContext, MainActivity::class.java)
                cosa.putExtra("nom", nom)
                cosa.putExtra("edad", edad)
                cosa.putExtra("alçada", altura)
                cosa.putExtra("peso", pes)
                cosa.putExtra("equipo", equip)
                startActivity(cosa)
            }
        }
    }


}


