package com.example.claudiahectorandroid.adapter

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.treball.Jugador
import com.example.treball.MainActivity
import com.example.treball.R
import com.example.treball.databinding.ItemEspanaBinding


import android.graphics.drawable.Drawable
import android.widget.Button
import androidx.core.content.res.ResourcesCompat.getDrawable


class JugadorViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val nombre = view.findViewById<TextView>(R.id.jugador)
    val foto = view.findViewById<ImageView>(R.id.foto)
    val boton = view.findViewById<Button>(R.id.boto)


    fun render(modeljugador: Jugador){
        nombre.text = modeljugador.nom

    }





}