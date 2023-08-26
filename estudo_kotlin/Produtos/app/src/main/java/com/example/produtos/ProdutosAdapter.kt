package com.example.produtos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProdutosAdapter(
    private var context: Context,
    private val produtos : List<Produto>
) : RecyclerView.Adapter<ProdutosAdapter.ViewHolder>()
{
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        fun vincular(produto: Produto) {
            val nome = itemView.findViewById<TextView>(R.id.textView)
            nome.text = produto.nome

            val valor = itemView.findViewById<TextView>(R.id.textView2)
            valor.text = produto.valor.toPlainString()
        }
    }

    // Criar a referencia para pegar as views e vai procurar e controlar elas
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.prouto_item, parent, false)
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
    }

}
