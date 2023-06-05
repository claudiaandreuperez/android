package com.example.treball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.claudiahectorandroid.adapter.JugadorAdapterJ
import com.example.treball.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private var jugadors_japo_mutable:MutableList<Jugador> = JugadorProvider.jugadors_japo.toMutableList()
    private lateinit var adapter: JugadorAdapterJ
    private var llmanager = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initRecycleView()
        val buton = findViewById<Button>(R.id.back)
        val buton2 = findViewById<Button>(R.id.afeguir)
        val buton3 = findViewById<Button>(R.id.actualitzar)
        Log.i("---->",jugadors_japo_mutable.toString())




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
        recyclerView.adapter = JugadorAdapterJ(JugadorProvider.jugadors_japo)
        adapter = recyclerView.adapter as JugadorAdapterJ
        adapter.notifyDataSetChanged()

    }
    fun addjugador(): List<Jugador> {
        val num1 = intent.getStringExtra("nom")
        val num2 = intent.getStringExtra("edad")
        val num3 = intent.getStringExtra("alçada")
        val num4 = intent.getStringExtra("peso")
        val num5 = intent.getStringExtra("equipo")
        val jugadornou = Jugador("$num1.png",num1.toString(),num2.toString(), num3.toString(), num4.toString(), num5.toString())
        jugadors_japo_mutable.add(index = 1, Jugador(jugadornou.foto, jugadornou.nom, jugadornou.edat, jugadornou.altura, jugadornou.pes, jugadornou.equip))
        return jugadors_japo_mutable
    }
}