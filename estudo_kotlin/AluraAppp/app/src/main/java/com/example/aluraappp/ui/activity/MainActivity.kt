package com.example.aluraappp.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aluraappp.R
import com.example.aluraappp.dao.ProdutoDAO
import com.example.aluraappp.models.Produto
import com.example.aluraappp.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        SUBSTITUIDO DENTRO DO MAIN.XML
//        lista.layoutManager = LinearLayoutManager(this)
    }

    override fun onResume() {
        super.onResume()

        // Procurando o recycler view
        var lista = findViewById<RecyclerView>(R.id.recyclerView)
        val dao = ProdutoDAO()

        lista.adapter = ListaProdutosAdapter(this, dao.listarProduto() )

        val floatButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        floatButton.setOnClickListener()
        {
            val intent = Intent(this, FormProdutoActivity::class.java)
            startActivity(intent)
        }
    }
}