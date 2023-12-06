package com.github.maazapan.scrumtable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class FrutaAdapter(private var frutas: List<Tarea>): RecyclerView.Adapter<FrutaAdapter.FrutaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrutaViewHolder {
        val inflador = LayoutInflater.from(parent.context)
        val view = inflador.inflate(R.layout.item_frutas, parent, false)
        return FrutaViewHolder(view)
    }

    override fun onBindViewHolder(holder: FrutaViewHolder, position: Int) {
        val fruta = frutas[position]
        holder.render(fruta)

        //aquí se aplica la lógica. ej: onClickListener
    }

    override fun getItemCount(): Int {
        return frutas.size
    }

    class FrutaViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val name: TextView = view.findViewById(R.id.fruta_name)
        val capital: TextView = view.findViewById(R.id.fruta_vitamina)
        val continent: TextView = view.findViewById(R.id.fruta_precio)
        val tarea: TextView = view.findViewById(R.id.fruta_tarea)

        fun render(fruta: Tarea) {
            name.text = fruta.nombre+ ", "
            capital.text = fruta.asignado
            continent.text = fruta.semana
            tarea.text = fruta.tarea

         //   Picasso.get().load(fruta.image).into(image)
        }
    }
}