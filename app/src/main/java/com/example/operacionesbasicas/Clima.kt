package com.example.operacionesbasicas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.operacionesbasicas.clima.Ciudad
import com.example.operacionesbasicas.clima.VerRed
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_info_clima.*

class Clima : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clima)

        val TAG = "xd"


        val Bla_paz = findViewById<Button>(R.id.btn_lp)
        val Boruro = findViewById<Button>(R.id.btn_oruro)
        val Bpotosi = findViewById<Button>(R.id.btn_potosi)

        val Bcochabamba = findViewById<Button>(R.id.btn_cochabamba)
        val Btarija = findViewById<Button>(R.id.btn_tarija)
        val Bchuquisaca = findViewById<Button>(R.id.btn_chuquisaca)

        val Bbeni = findViewById<Button>(R.id.btn_beni)
        val BsantaCruz = findViewById<Button>(R.id.santa_cruz)
        val Bpando = findViewById<Button>(R.id.btn_pando)

        Bla_paz.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3911925")
            startActivity(intent)
        })

        Boruro.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3909233")
            startActivity(intent)
        })

        Bpotosi.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "4404348")
            startActivity(intent)
        })

        Bcochabamba.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3919966")
            startActivity(intent)
        })

        Bchuquisaca.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3920177")
            startActivity(intent)
        })
        Btarija.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3903319")
            startActivity(intent)
        })

        BsantaCruz.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "6356861")
            startActivity(intent)
        })
        Bbeni.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3923172")
            startActivity(intent)
        })
        Bpando.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3908600")
            startActivity(intent)
        })
    }
}





