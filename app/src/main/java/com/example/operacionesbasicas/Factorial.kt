package com.example.operacionesbasicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Factorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factorial)
        val txtFactorial = findViewById<EditText>(R.id.edFactorial)
        val txtbutton = findViewById<Button>(R.id.btCalfular)

        txtbutton.setOnClickListener {
            val factorial: Int = txtFactorial.text.toString().toInt()
            if (factorial > 16) {
                Toast.makeText(
                    this,
                    "EL número ingresado es demasiado grade ",
                    Toast.LENGTH_SHORT
                ).show()
                txtFactorial.text.clear()
            } else {
                Toast.makeText(
                    this,
                    "EL factorial es: ${calcularFactorial(factorial)} ",
                    Toast.LENGTH_SHORT
                ).show()
                txtFactorial.text.clear()
            }

        }
    }

    fun calcularFactorial(x: Int): Int {

        var f = 1
        var i = 1
        while (i <= x) {
            f *= i
            i++
        }

        return f
    }
}