package com.github.maazapan.scrumtable

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment() {

    private var frutas : List<Tarea> = emptyList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        initData()
        val recyclerView =
            view.findViewById<RecyclerView>(
                R.id.frutasRecycler
            )
        val adapter = FrutaAdapter(frutas)
        //Lista anchura completa
        val layoutManager = LinearLayoutManager(container?.context)
        //Cuadricula 2X2
     //  val gridLayoutManager = GridLayoutManager(container?.context, 2)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
        return view
    }

    private fun initData() {
        frutas = listOf(
            Tarea(1, "Proyecto Final", "Semana 1", "Login", "Roberto Barrios"),
            Tarea(2, "Tarea fianl", "Semana 3", "Menu", "Paul Marin"),
            Tarea(3, "Tarea 3", "Semana 1", "Scrum", "Ulises"),
            Tarea(4, "Tarea 6", "Semana 4", "Datos", "Hector"),
            Tarea(5, "Tarea 8", "Semana 7", "Final", "Manuel"),
            Tarea(6, "Proyecto Empresa", "Semana 8", "Principal", "Cheno"),
            Tarea(7, "Proyecto", "Semana 1", "Menu", "Jose"),
            Tarea(8, "Tarea 1", "Semana 3", "Final", "Barrios"),

            )
    }
}