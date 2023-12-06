package com.github.maazapan.scrumtable

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val list = view.findViewById<Button>(R.id.buttonList)

        list.setOnClickListener {
            val controller : NavController =
                Navigation.findNavController(view)
            controller.navigate(
                R.id.action_firstFragment_to_listFragment)
        }

        return view
    }
}