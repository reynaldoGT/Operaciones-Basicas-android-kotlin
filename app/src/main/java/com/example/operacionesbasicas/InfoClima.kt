package com.example.operacionesbasicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.operacionesbasicas.clima.Ciudad
import com.example.operacionesbasicas.clima.VerRed
import com.example.operacionesbasicas.databinding.ActivityInfoClimaBinding

import com.google.gson.Gson

class InfoClima : AppCompatActivity() {


    private lateinit var binding: ActivityInfoClimaBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        //2 using the binding in activities
        binding = ActivityInfoClimaBinding.inflate((layoutInflater))
        // 3
        setContentView(binding.root)

        val ciudad = intent.getStringExtra("xd")

        if (VerRed.hayRed(this)) {
            //ejecutar la solicitud http
            //solitcitidWithVolley("https://api.openweathermap.org/data/2.5/weather?id=3435910&appid=1df4b54c2551746c00253fd4a88eedb4")
            //key : 1df4b54c2551746c00253fd4a88eedb4
            //la paz id 3911925
            Ciudad_id(ciudad!!)


        } else {
            println("no hay red")
            Log.d("no hay red", "no se encontro la red")
        }

    }


    private fun Ciudad_id(id: String) {
        val URL =
            "https://api.openweathermap.org/data/2.5/weather?id=$id&appid=1df4b54c2551746c00253fd4a88eedb4&units=metric&lang=es"
        val queue = Volley.newRequestQueue(this)

        val request =
            StringRequest(Request.Method.GET, URL, Response.Listener<String> { response ->
                try {

                    val gson = Gson()
                    val ciudad = gson.fromJson(response, Ciudad::class.java)

                    binding.progressBar.visibility = View.GONE
                    binding.lyClima.visibility = View.VISIBLE

                    binding.tvCiudad.text = ciudad.name
                    binding.tvGrados.text = ciudad.main?.temp.toString() + "°"
                    binding.tvEstado.text = ciudad.weather?.get(0)?.description?.toUpperCase()


                } catch (e: Exception) {
                    Log.d("error en la peticion", e.message)
                }
            }, Response.ErrorListener { error ->
                Log.d("Error en el listener", error.message)

                binding.progressBar.visibility = View.VISIBLE
                binding.lyClima.visibility = View.GONE
            })
        queue.add(request)

    }


}