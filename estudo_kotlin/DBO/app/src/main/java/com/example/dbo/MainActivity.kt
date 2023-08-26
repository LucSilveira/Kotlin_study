package com.example.dbo

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.drawable.toBitmap
import com.example.sqlite.DBHelper
import com.example.sqlite.models.UserEntity

class MainActivity : AppCompatActivity()
{
    private val PICK_IMAGE_REQUEST = 1
    private lateinit var adapter: ArrayAdapter<UserEntity>
    private var position : Int = -1

    lateinit var imgView : ImageView

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instanciando o banco
        val dbo = DBHelper(this);
        val listaUsuario = dbo.listarUsuario();


        val lista = findViewById<ListView>(R.id.listinha)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaUsuario)
        lista.adapter = adapter

        // Pegando os clicks dos itens das listas
        lista.setOnItemClickListener{ _, _, position, _ ->
            findViewById<TextView>(R.id.idText).setText("Id: ${listaUsuario[position].id}")
            findViewById<EditText>(R.id.edit_name).setText("${listaUsuario[position].username}")
            findViewById<EditText>(R.id.edit_senha).setText("${listaUsuario[position].password}")
            findViewById<ImageView>(R.id.imgView).setImageBitmap( listaUsuario[position].img )
            this.position = position
        }

        val btn_inserir = findViewById<Button>(R.id.btn_inserir)
        btn_inserir.setOnClickListener()
        {
            val drawable = findViewById<ImageView>(R.id.imgView).drawable
            val bitmap = drawable.toBitmap()

            val res = dbo.InserirUsuario( findViewById<EditText>(R.id.edit_name).text.toString(),
                                            findViewById<EditText>(R.id.edit_name).text.toString(),
                                            bitmap)

            if( res >= 0 )
            {
                Toast.makeText(applicationContext, "Inserido", Toast.LENGTH_SHORT).show()
                listaUsuario.add( UserEntity(res.toInt(),
                                                findViewById<EditText>(R.id.edit_name).text.toString(),
                                                findViewById<EditText>(R.id.edit_senha).text.toString(),
                                                findViewById<ImageView>(R.id.imgView).drawable.toBitmap()) )
                adapter.notifyDataSetChanged()
            }else{
                Toast.makeText(applicationContext, "Erro", Toast.LENGTH_SHORT).show()
            }
        }

        val btn_alterar = findViewById<Button>(R.id.btn_alterar)
        btn_alterar.setOnClickListener()
        {
            val res = dbo.AtualizarUsuario(     listaUsuario[position].id,
                                                findViewById<EditText>(R.id.edit_name).text.toString(),
                                                findViewById<EditText>(R.id.edit_senha).text.toString() )

            if (res > 0)
            {
                Toast.makeText(applicationContext, "Atualizado", Toast.LENGTH_SHORT).show()

                listaUsuario[position].username = findViewById<EditText>(R.id.edit_name).text.toString()
                listaUsuario[position].password = findViewById<EditText>(R.id.edit_senha).text.toString()
                adapter.notifyDataSetChanged()
            }else{
                Toast.makeText(applicationContext, "Erro", Toast.LENGTH_SHORT).show()
            }
        }

        val btn_remover = findViewById<Button>(R.id.btn_remover)
        btn_remover.setOnClickListener()
        {
            if( position > -1)
            {
                val res = dbo.RemoverUsuario(listaUsuario[position].id)
                if( res > 0 )
                {
                    Toast.makeText(applicationContext, "Removido", Toast.LENGTH_SHORT).show()
                    listaUsuario.removeAt(position)
                    adapter.notifyDataSetChanged()
                }else{
                    Toast.makeText(applicationContext, "Erro", Toast.LENGTH_SHORT).show()
                }
            }
        }

        // Clicando no item de imagem
        imgView = findViewById(R.id.imgView)
        imgView.setOnClickListener(){

            val intent = Intent( Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(intent, PICK_IMAGE_REQUEST)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null) {
            // Aqui você pode trabalhar com a URI da imagem selecionada

            val selectedImageUri: Uri? = data.data
            var bitmap = MediaStore.Images.Media.getBitmap( this.contentResolver, selectedImageUri )

            imgView.setImageBitmap(bitmap)
        }
    }
}