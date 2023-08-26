package com.example.conversormoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity()
{
    // Criando as variáveis para armazenar os elementos de tela
    private lateinit var resultado : TextView;
    private lateinit var campo : TextView;
    private lateinit var botao : Button;
    private lateinit var radio : RadioGroup;

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adicionando as referencias dos elementos que utilizamos na tela
        // findViewById - objeto para procurar os elementos da tela

        resultado = findViewById<TextView>(R.id.result_txt);
        campo     = findViewById<TextView>(R.id.edit_price);
        botao     = findViewById<Button>(R.id.bt_conversor);
        radio     = findViewById<RadioGroup>(R.id.radio_group);

            // Recebendo o valor do radio group selecionado

        // Capturando o evento de click do botao
        botao.setOnClickListener()
        {
            resultado.text = ConverterValores( campo.text.toString(), radio.checkedRadioButtonId );
        }
    }

    private fun ConverterValores(valor : String, radioSelected : Int) : String
    {
        if( !valor.isEmpty() )
        {
            val dolar = 5.731802;
            val euro = 6.828736;
            val pesoChileno = 0.008038

            // Verificando o valor do cara checado
            if( radioSelected == R.id.radio_dolar )
            {
                return "${ "%.2f".format((valor.toDouble() * dolar))}";

            }else if( radioSelected == R.id.radio_euro ){
                return "${"%.2f".format((valor.toDouble() * euro))}";

            }else{
                return "${"%.2f".format((valor.toDouble() * pesoChileno))}"
            }

            // Executando um processo alternativo para executar em paralelo a aplicação
//            Thread{
//                var url = URL("");
//                var conexao = url.openConnection as HttpURLConnection

//                try {
//                    var data = conexao.inputStream.bufferedReader().readText();
//                    var jsonObj = JSONObject(data)

//                    runOnUiThread{
//                        val res = jsonObj.getDouble("${currency}_BRL")
//                    }

//                }finally {
////                    conexao.disconnect()
//                }
//            }.start();

        }else{
            return ""
        }
    }
}