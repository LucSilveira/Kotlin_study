package com.example.aluraappp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.aluraappp.R
import com.example.aluraappp.dao.ProdutoDAO
import com.example.aluraappp.models.Produto
import java.math.BigDecimal

class FormProdutoActivity : AppCompatActivity(R.layout.activity_form_produto) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val botao = findViewById<Button>(R.id.botao)

        botao.setOnClickListener()
        {
            val campoNome = findViewById<EditText>(R.id.nome)
            val campoDescricao = findViewById<EditText>(R.id.descricao)
            val campoPreco = findViewById<EditText>(R.id.valor)

            // Convertendo o valor do produto
            val valor = if( campoPreco.text.toString().isBlank() )
            {
                BigDecimal.ZERO
            }else{
                BigDecimal( campoPreco.text.toString() )
            }

            // Criando um novo produto
            val novoProduto = Produto( campoNome.text.toString(), campoDescricao.text.toString(), valor  )
            Toast.makeText(this, "${campoNome.text.toString()}, ${campoDescricao.text.toString()}", Toast.LENGTH_SHORT).show()

            Log.i("FormProdutoActivity", "OnCreate : ${campoNome.text.toString()}")
            ProdutoDAO().AdicionarProduto(novoProduto)

            // Encerrando a activity
            finish()
        }

        val botao2 = findViewById<Button>(R.id.button)
        botao2.setOnClickListener()
        {
            val extras = intent.extras
            if (extras != null) {
                val valorRecebido = extras.get("position").toString()

                if( !valorRecebido.isEmpty() )
                {
                    ProdutoDAO().removerProduto( valorRecebido.toInt() )
                    Toast.makeText(this, "Removido", Toast.LENGTH_SHORT).show()
                }
            }

            finish()
        }
    }
}