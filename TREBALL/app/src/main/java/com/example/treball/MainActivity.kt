package com.example.treball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.claudiahectorandroid.adapter.JugadorAdapter
import com.example.treball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var jugadors_españa_mutable:MutableList<Jugador> = JugadorProvider.jugadors_españa.toMutableList()
    private lateinit var adapter: JugadorAdapter
    private var llmanager = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycleView()
        val buton = findViewById<Button>(R.id.back)
        val buton2 = findViewById<Button>(R.id.afeguir)
        val buton3 = findViewById<Button>(R.id.actualitzar)



        buton.setOnClickListener {
            val intento2 = Intent(this, Inici::class.java)
            startActivity(intento2)
        }
        buton2.setOnClickListener {
            val intento1: Intent = Intent(this, NouJugador::class.java)
            startActivity(intento1)
        }
        buton3.setOnClickListener {
            addjugador()

        }

    }
    private fun initRecycleView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclejugador)
        val manager = llmanager
        recyclerView.layoutManager =  manager
        recyclerView.adapter = JugadorAdapter(JugadorProvider.jugadors_españa)
        adapter = recyclerView.adapter as JugadorAdapter
        adapter.notifyDataSetChanged()

    }
    fun addjugador(): List<Jugador> {
        val num1 = intent.getStringExtra("nom")
        val num2 = intent.getStringExtra("edad")
        val num3 = intent.getStringExtra("alçada")
        val num4 = intent.getStringExtra("peso")
        val num5 = intent.getStringExtra("equipo")
        val jugadornou = Jugador("$num1.png",num1.toString(),num2.toString(), num3.toString(), num4.toString(), num5.toString())
        jugadors_españa_mutable.add(index = 1, Jugador(jugadornou.foto, jugadornou.nom, jugadornou.edat, jugadornou.altura, jugadornou.pes, jugadornou.equip))
        Log.i("---->",jugadors_españa_mutable.toString())
        return  jugadors_españa_mutable

    }
}