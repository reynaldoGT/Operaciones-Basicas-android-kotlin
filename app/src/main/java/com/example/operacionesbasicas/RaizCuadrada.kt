package com.example.operacionesbasicas

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.sqrt

class RaizCuadrada : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raiz_cuadrada)


        val btnCalcular = findViewById<Button>(R.id.btnRaizCuadrada)

        btnCalcular.setOnClickListener{
            calcularRaizCuadrada()
        }
    }
    fun calcularRaizCuadrada(){
        val txtNumero = findViewById<EditText>(R.id.edNumero)
        if(txtNumero.text.toString()!=""){
            val numero = txtNumero.text.toString().toDouble()
            var resultado = sqrt(numero)
            ocultarTeclado()
            Toast.makeText(this, "El resultado es ${resultado.toInt()}", Toast.LENGTH_SHORT).show()
        }else{

            Toast.makeText(this, "Por favor Ingresa algun Numero", Toast.LENGTH_SHORT).show()
        }

    }

    fun ocultarTeclado() {
        val inputManager =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        inputManager.hideSoftInputFromWindow(
            currentFocus!!.windowToken,
            InputMethodManager.HIDE_NOT_ALWAYS
        )
    }
}