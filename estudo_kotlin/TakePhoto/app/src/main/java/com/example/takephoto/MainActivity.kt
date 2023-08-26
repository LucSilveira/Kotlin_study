package com.example.takephoto

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private val REQUEST_IMAGE_CAPTURE = 1
    private val PICK_IMAGE_REQUEST = 1

    private var buttonBoll = false;
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Chamando o mecanismo de foto
        imageView = findViewById<ImageView>(R.id.imageView)

        val botao = findViewById<Button>(R.id.button)
        botao.setOnClickListener()
        {
            buttonBoll = false
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            //startActivity(intent)
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)
        }

        val galeria = findViewById<Button>(R.id.button2)
        galeria.setOnClickListener()
        {
            buttonBoll = true
            val intent2 = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(intent2, PICK_IMAGE_REQUEST)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if( buttonBoll )
        {
            if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null)
            {
                val selectedImageUri: Uri? = data.data
                var bitmap = MediaStore.Images.Media.getBitmap( this.contentResolver, selectedImageUri )

                imageView.setImageBitmap(bitmap)
            }

        }else{
            if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
                val imageBitmap = data?.extras?.get("data") as Bitmap

                imageView.setImageBitmap(imageBitmap)
            }
        }
    }
}