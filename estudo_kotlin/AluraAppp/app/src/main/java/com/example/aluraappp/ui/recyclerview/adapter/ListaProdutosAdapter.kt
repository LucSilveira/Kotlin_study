package com.example.aluraappp.ui.recyclerview.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aluraappp.R
import com.example.aluraappp.models.Produto
import com.example.aluraappp.ui.activity.FormProdutoActivity
import com.example.aluraappp.ui.activity.MainActivity

class ListaProdutosAdapter(
    private val context: Context,
    private val produtos : List<Produto>
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>()
{
    companion object {
        const val REQUEST_CODE_ITEM_DETAILS = 1
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        fun vincular(produto: Produto) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = produto.nome

            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = produto.descricao

            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = produto.valor.toPlainString()
        }
    }

    // Criar a referencia para pegar as views e vai procurar e controlar elas
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int
    {
        return produtos.size
    }

    // Indica qual o item que o adpter vai colocar, e qual a posição que vamos adaptar
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincular(produto)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, FormProdutoActivity::class.java)
            intent.putExtra("position", position)
            (holder.itemView.context as Activity).startActivityForResult(intent, REQUEST_CODE_ITEM_DETAILS)
        }
    }

}
