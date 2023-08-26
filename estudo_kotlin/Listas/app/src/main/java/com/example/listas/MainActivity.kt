package com.example.listas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import javax.net.ssl.SSLSessionBindingListener

class MainActivity : AppCompatActivity()
{
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var lista = ArrayList<Int>()

        lista.add(22)
        lista.add(90)
        lista.add(4)

        val elementoLista = findViewById<ListView>(R.id.listinha);
        val adapter = ArrayAdapter(this, R.id.listinha, lista)

        elementoLista.adapter = adapter
    }
}