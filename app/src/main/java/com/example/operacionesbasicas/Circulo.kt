package com.example.operacionesbasicas

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class Circulo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circulo)

        val btnCalculaRadio = findViewById<Button>(R.id.btnCalcularCicrculo)
        btnCalculaRadio.setOnClickListener {
            calcular()
        }


    }

    private fun calcular() {
        val PI = 3.1416
        val txtRadio = findViewById<EditText>(R.id.edRAdio)

        if (txtRadio.text.toString() != "") {
            val cincuferencia = 2 * PI * txtRadio.text.toString().toInt()
            val radio = cincuferencia / (2 * PI)
            val resutaldo = "La cincuferencia es de $cincuferencia y el radio es  $radio"
            ocultarTeclado()
            val snackbar = Snackbar
                .make(findViewById(R.id.Laout_Circulo), resutaldo, Snackbar.LENGTH_LONG)
                .setBackgroundTint(Color.parseColor("#0277bd"))
            snackbar.show()

        } else {
            ocultarTeclado()
            val snackbar = Snackbar
                .make(
                    findViewById(R.id.Laout_Circulo),
                    "Por favor ingresa algun numero",
                    Snackbar.LENGTH_LONG
                )
                .setBackgroundTint(Color.parseColor("#f44336"))
            snackbar.show()
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