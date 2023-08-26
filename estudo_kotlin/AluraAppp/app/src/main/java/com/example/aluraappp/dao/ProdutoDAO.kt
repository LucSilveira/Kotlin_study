package com.example.aluraappp.dao

import com.example.aluraappp.models.Produto

class ProdutoDAO
{
//    private val produtos = mutableListOf<Produto>();

    fun AdicionarProduto(produto : Produto)
    {
        produtos.add(produto)
    }

    fun listarProduto() : List<Produto>
    {
        return produtos.toList()
    }

    fun removerProduto(position : Int)
    {
        produtos.removeAt(position)
    }

    companion object
    {
        private val produtos = mutableListOf<Produto>();
    }
}