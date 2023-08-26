package com.example.orgs

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity()
{
    // Sobrescrevendo a função de criar a aplicação para aplicar nossas ações
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?)
    {
        // responsável pela sobrescrita dos elementos
        super.onCreate(savedInstanceState, persistentState)

//        Toast.makeText(this, "Bem vindo ao orgs", Toast.LENGTH_SHORT).show()
//
//        val view = TextView(this);

        setContentView(R.layout.activity_main)
    }
}