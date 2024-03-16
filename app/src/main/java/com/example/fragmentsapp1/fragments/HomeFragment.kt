package com.example.fragmentsapp1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentsapp1.R
import com.example.fragmentsapp1.adapters.SimpleAdapter


/**
 * Fragmento HomeFragment: Muestra una lista simple de elementos utilizando un RecyclerView.
 * Este fragmento se encarga de configurar y mostrar la interfaz de usuario correspondiente a la sección de inicio.
 */


class HomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
// Este método se llama cuando el fragmento está siendo creado.
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Este método se llama después de que la vista del fragmento ha sido creada.
        // Aquí es donde se configuran los componentes de la vista, como el RecyclerView.

        val list = listOf<String>("Elemento 1","Elemento 2","Elemento 3","Elemento 4","Elemento 5","Elemento 6","Elemento 7","Elemento 8","Elemento 9","Elemento 10")
        val recycleView = view.findViewById<RecyclerView>(R.id.home_recycleView)

        recycleView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        recycleView.adapter = SimpleAdapter(list)

    }
}