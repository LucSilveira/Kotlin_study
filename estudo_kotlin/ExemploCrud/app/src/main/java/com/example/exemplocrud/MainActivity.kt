package com.example.exemplocrud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    private lateinit var listView: ListView
    private lateinit var buttonCreate: Button
    private lateinit var buttonEdit: Button
    private lateinit var buttonRemove: Button

    private lateinit var nome : TextView
    private lateinit var email: TextView
    private var position = -1

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        buttonCreate = findViewById<Button>(R.id.button_create)
        buttonEdit = findViewById<Button>(R.id.button_edit)
        buttonRemove = findViewById<Button>(R.id.button_remove)
        nome = findViewById<TextView>(R.id.editTextTextPersonName)
        email = findViewById<TextView>(R.id.editTextTextPersonName2)

        var listaUsuario = ArrayList<Usuario>();
        listaUsuario.add( Usuario("Max", "max@email.com") )
        Listar(listaUsuario)

        listView.setOnItemClickListener{ _, _, positon, _  ->
            this.position = positon

            nome.setText( listaUsuario.get(positon).nome )
            email.setText( listaUsuario.get(positon).email )
        }

        buttonCreate.setOnClickListener()
        {
            listaUsuario.add( Usuario( nome.text.toString(), email.text.toString() ) )
            Listar( listaUsuario )
        }

        buttonEdit.setOnClickListener()
        {
            listaUsuario[this.position].nome = nome.text.toString()
            listaUsuario[this.position].email = email.text.toString()

            Listar( listaUsuario )
        }

        buttonRemove.setOnClickListener()
        {
            listaUsuario.removeAt( position )
            Listar( listaUsuario )
        }
    }

    fun Listar(list : ArrayList<Usuario>)
    {
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.adapter = adapter
    }
}