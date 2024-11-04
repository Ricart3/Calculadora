package com.example.practica_1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //Declarar Variables  xml  -- Fucional
    lateinit var campo1:EditText
    lateinit var  campo2:EditText
    lateinit var btsum:Button
    lateinit var resultado:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Cazamiento -- XML -- Variable Locales
        campo1 = findViewById(R.id.Et_campo1)
        campo2 = findViewById(R.id.Et_campo2)
        btsum= findViewById(R.id.btnSumar)
        resultado= findViewById(R.id.txtResultado)

        // LLamada a Funcion -- Evento Onclik
        btsum.setOnClickListener(View.OnClickListener {
            // Variables Locales
            val num1 = Integer.parseInt(campo1.text.toString())
            val num2 = Integer.parseInt(campo2.text.toString())

            //Mostrar Resultado
            resultado.setText("Resultado: "+ sumar(num1,num2))


        })


    }
    //Trabajar Toda La Logica de Mi Aplicacion

    fun sumar(num1:Int, num2:Int):Int{
        return num1 + num2
    }
}
