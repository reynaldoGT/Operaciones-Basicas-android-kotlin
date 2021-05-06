package com.example.operacionesbasicas

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val titulos = ArrayList<Titulo_grid>()
        titulos.add(
            Titulo_grid(
                "Factorial de un numero",
                "Hallar el factorial de un numero",
                R.drawable.i_exclamation

            )
        )
        titulos.add(
            Titulo_grid(
                "Raiz Cuadrada",
                "Sacar la rain cuadrada de un numero",
                R.drawable.i_raiz_cuadrada
            )
        )
        titulos.add(
            Titulo_grid(
                "Ver el clima en la ciudad",
                "Saber el clima ahora",
                R.drawable.i_cloud
            )
        )
        titulos.add(
            Titulo_grid(
                "Averiguar porcentaje",
                "Ver porcenje de un numero X",
                R.drawable.i_percentage
            )
        )
        titulos.add(
            Titulo_grid(
                "Cincuferencia y Radio de un circulo",
                "Calcular la cinfurencia y el radio de un circulo",
                R.drawable.i_circle_no_fill
            )
        )

        val grid: GridView = findViewById(R.id.gv_items)


        val adaptadorCustomGrid = AdaptadorCustomGrid(this, titulos)
        grid.adapter = adaptadorCustomGrid

        grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            when (position) {
                0 -> {
                    val intent = Intent(this, Factorial::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent = Intent(this, RaizCuadrada::class.java)
                    startActivity(intent)
                }
                2 -> {
                    val intent = Intent(this, Clima::class.java)
                    startActivity(intent)
                }
                3 -> {
                    val intent = Intent(this, Porcentaje::class.java)
                    startActivity(intent)
                }

                4 -> {
                    val intent = Intent(this, Circulo::class.java)
                    startActivity(intent)
                }
                else -> {
                    Snackbar.make(
                        view, // Parent view
                        "Hi from position $position", // Message to show

                        Snackbar.LENGTH_SHORT // How long to display the message.
                    ).setBackgroundTint(Color.parseColor("#FF108714")).show()
                }
            }
        }
    }

}