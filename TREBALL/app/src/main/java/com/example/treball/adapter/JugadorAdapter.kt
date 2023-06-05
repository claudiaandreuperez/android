package com.example.claudiahectorandroid.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.treball.Dades_Jugadors
import com.example.treball.Jugador
import com.example.treball.R


class JugadorAdapter(val jugadors_espana: List<Jugador>): RecyclerView.Adapter<JugadorViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JugadorViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return JugadorViewHolder(layoutInflater.inflate(R.layout.item_espana, parent, false))
    }

    override fun onBindViewHolder(holder: JugadorViewHolder, position: Int) {
        val item = jugadors_espana[position]
        val foto = item.foto
        val nom = item.nom
        val edat = item.edat
        val altura = item.altura
        val pes = item.pes
        val equip = item.equip
        val itemHolder = holder
        holder.render(item)
        holder.boton.setOnClickListener {
            val intent = Intent(itemHolder.boton.context, Dades_Jugadors::class.java)
            intent.putExtra("foto", foto)
            intent.putExtra("nom", nom)
            intent.putExtra("edat", edat)
            intent.putExtra("altura", altura)
            intent.putExtra("pes", pes)
            intent.putExtra("equip", equip)
            holder.itemView.context.startActivity(intent)
        }

        /*holder.boton.setOnClickListener {
            val intento1 = Intent(this, Dades_Jugadors::class.java)
            startActivity(intento1)
        }*/

    }

    override fun getItemCount(): Int {
        return jugadors_espana.size
    }

}


/*

    //Sets Text
    holder.name.setText(itemName);

    //holder.playerName.setTag(R.string.listSize, playerList.size());
    holder.name.setTag(position);

    //holder.image.setImageAlpha(playerItem.getImage());
    holder.image.setImageResource(playerItem.getImage());
    holder.image.setTag(position);

    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //goes to new activity passing the item name
            Intent intent = new Intent(itemHolder.itemView.getContext(), MapActivity.class);
            Bundle b = new Bundle();

            //get text for current item
            String textGet = itemName;
            //put text into a bundle and add to intent
            intent.putExtra("text", textGet);

            //get position to carry integer
            intent.putExtra("position", itemPosition);

            intent.putExtras(b);

            //begin activity
            itemHolder.itemView.getContext().startActivity(intent);
        }
    });

}*/