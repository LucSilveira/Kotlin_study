package com.example.exemplolistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)

        var lista = ArrayList<Int>()

        lista.add(22)
        lista.add(90)
        lista.add(4)

        val elementoLista = findViewById<ListView>(R.id.lista_view);
        val adapter = ArrayAdapter(this, android.R.layout.activity_list_item, lista)

        elementoLista.adapter = adapter
    }
}