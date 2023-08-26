package com.example.sqlite

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.example.sqlite.models.UserEntity
import java.io.ByteArrayOutputStream

class DBHelper(context : Context) : SQLiteOpenHelper(context, "database.db", null, 1)
{
    private var imgInBytes = byteArrayOf()

    val sql = arrayOf(
        "CREATE TABLE Usuario (id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, password TEXT, image Blob)"
    )

    // Função para criar uma nova instancia ou elemento no banco
    override fun onCreate(db: SQLiteDatabase) {
        sql.forEach { db.execSQL(it) }
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        db.execSQL("DROP TABLE Usuario")
        onCreate(db);
    }

    fun UsuarioById(id : Int) : Cursor
    {
        val db = this.readableDatabase
        val c = db.rawQuery("SELECT * FROM Usuario WHERE id=?", arrayOf(id.toString()))
        db.close()

        return c
    }

    fun InserirUsuario(nome: String, senha : String, img : Bitmap) : Long
    {
        val db = this.writableDatabase
        val valoresObjeto = ContentValues();

        valoresObjeto.put("username", nome)
        valoresObjeto.put("password", senha)

        // capturando a imagem
        val objImg = ByteArrayOutputStream()
        img.compress( Bitmap.CompressFormat.JPEG, 100, objImg )
        imgInBytes = objImg.toByteArray()

        valoresObjeto.put("image", imgInBytes )

        // nullColumnHack - configurações ou validações
        val inserir = db.insert("Usuario", null, valoresObjeto);
        db.close()

        return inserir
    }

    fun AtualizarUsuario(id : Int, nome: String, senha : String) : Int
    {
        val db = this.writableDatabase
        val valoresObjeto = ContentValues();

        valoresObjeto.put("username", nome)
        valoresObjeto.put("password", senha)
        val res = db.update("Usuario", valoresObjeto, "id=?", arrayOf(id.toString()))
        db.close()

        return res
    }

    fun RemoverUsuario(id : Int) : Int
    {
        val db = this.writableDatabase
        val res = db.delete("Usuario", "id=?", arrayOf(id.toString()))
        db.close()
        return res
    }

    fun listarUsuario() : ArrayList<UserEntity>
    {
        val db = this.readableDatabase
        val c = db.rawQuery("SELECT * FROM Usuario", null);

        val listaUsuario : ArrayList<UserEntity> = ArrayList()
        if( c.count > 0 )
        {
            c.moveToFirst()
            do{
                val idIndex = c.getColumnIndex("id");
                val nameIndex = c.getColumnIndex("username");
                val senhaIndex = c.getColumnIndex("password");
                val imgIndex = c.getColumnIndex("image")

                val id = c.getInt( idIndex )
                val username = c.getString(nameIndex)
                val password = c.getString(senhaIndex)

                if( c.getBlob( imgIndex ).toString().isNotEmpty() ){
                    val img = c.getBlob( imgIndex )

                    val bitmap = BitmapFactory.decodeByteArray( img, 0, img.size )
                    listaUsuario.add(UserEntity(id, username, password, bitmap))
                }else{

                    listaUsuario.add(UserEntity(id, username, password, null))
                }

            }while (c.moveToNext())
        }

        db.close()
        return listaUsuario
    }

    // Elemento buscado da base de dados e devolvendo suas informações
    fun BuscarUsuario() : Cursor
    {
        val db = this.readableDatabase
        val c = db.rawQuery("SELECT * FROM Usuario", null)
        db.close()

        return c
    }
}