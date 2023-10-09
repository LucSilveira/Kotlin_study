 package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

 class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preference = getSharedPreferences("chaveGeral", MODE_PRIVATE)

        var campoEmail = findViewById<EditText>(R.id.email)
        var campoIdade = findViewById<EditText>(R.id.idade)
        var campoNome = findViewById<EditText>(R.id.primeiroNome)

        var btnGravar = findViewById<Button>(R.id.gravarConteudo)
        var btnMostrar = findViewById<Button>(R.id.mostrarConteudo)

        var txt_email = findViewById<TextView>(R.id.txt_email)
        var txt_idade = findViewById<TextView>(R.id.txt_idade)
        var txt_nome = findViewById<TextView>(R.id.txt_nome)

        btnGravar.setOnClickListener(){

            val editor = preference.edit()

            editor.putString("chaveEmail", campoEmail.text.toString())
            editor.putString("chaveIdade", campoIdade.text.toString())
            editor.putString("chaveNome", campoNome.text.toString())
            editor.commit()

            Toast.makeText(this, "Gravado com sucesso", Toast.LENGTH_SHORT).show()
        }

        btnMostrar.setOnClickListener(){

            txt_email.text = preference.getString("chaveEmail", "")
            txt_nome.text = preference.getString("chaveNome", "")
            txt_idade.text = preference.getString("chaveIdade", "")
        }
    }
}