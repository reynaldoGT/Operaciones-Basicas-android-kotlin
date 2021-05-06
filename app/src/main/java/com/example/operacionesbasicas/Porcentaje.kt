package com.example.operacionesbasicas

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class Porcentaje : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_porcentaje)

        val seek = findViewById<SeekBar>(R.id.seekBar)
        seek?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            val tvPorcentaje = findViewById<TextView>(R.id.tvPorcentaje)
            val numeroCalcular = findViewById<TextView>(R.id.edNumeroCalcular)

            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                // write custom code for progress is changed
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (numeroCalcular?.text.toString() == "") {
                    Toast.makeText(
                        this@Porcentaje,
                        "Ingresa alguna numero por favor", Toast.LENGTH_SHORT
                    ).show()
                } else {
                    val result = (numeroCalcular?.text.toString().toInt()) * seek.progress / 100
                    /*
                    Toast.makeText(
                        this@Porcentaje,
                        "El porcentaje de  ${numeroCalcular.text} es : $result", Toast.LENGTH_SHORT
                    ).show()*/
                    ocultarTeclado()
                    val snackbar = Snackbar.make(
                        findViewById(R.id.layout_per),
                        "El porcentaje de  ${numeroCalcular.text} es : $result",
                        Snackbar.LENGTH_SHORT
                    ).setBackgroundTint(Color.parseColor("#0277bd")).show()

                    tvPorcentaje.text = """Calcular el ${seek.progress} %"""

                }
            }

        })
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