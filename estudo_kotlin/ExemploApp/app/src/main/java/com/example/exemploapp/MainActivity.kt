package com.example.exemploapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Identificar os elementos
        var textoInicial = findViewById<TextView>(R.id.txt_inicial)
        var botao = findViewById<Button>(R.id.button)
        var checkbox = findViewById<CheckBox>(R.id.checkBox)

        textoInicial.text = "Olá mundo";

        botao.setOnClickListener()
        {
            var retorno : String = "Hello World!"

            if( !checkbox.isChecked )
            {
                retorno = "Goodbye World!"
            }

            Toast.makeText(this, "$retorno", Toast.LENGTH_SHORT).show()
        }
    }
}