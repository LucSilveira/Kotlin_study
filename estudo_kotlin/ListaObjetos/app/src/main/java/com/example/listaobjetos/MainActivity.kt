package com.example.listaobjetos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val personList = listOf(
            Person("João", 25),
            Person("Maria", 30),
            Person("Pedro", 28)
        )

        val adapter = ArrayAdapter(this, R.layout.list_item, personList.map { "${it.name} - ${it.age}" })
        listView.adapter = adapter
    }
}

class Person(val name: String, val age: Int)