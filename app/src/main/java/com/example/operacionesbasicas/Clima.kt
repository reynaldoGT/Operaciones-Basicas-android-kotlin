package com.example.operacionesbasicas

import android.app.Activity
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
import com.example.operacionesbasicas.databinding.ActivityClimaBinding
import com.example.operacionesbasicas.databinding.ActivityInfoClimaBinding
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_info_clima.*

class Clima : AppCompatActivity() {

    private lateinit var binding: ActivityClimaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //2 using the binding in activities
        binding = ActivityClimaBinding.inflate((layoutInflater))
        // 3
        setContentView(binding.root)
        val TAG = "xd"


        binding.btnLp.setOnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3911925")
            startActivity(intent)
        }

        binding.btnOruro.setOnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3909233")
            startActivity(intent)
        }

        binding.btnPotosi.setOnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "4404348")
            startActivity(intent)
        }

        binding.btnCochabamba.setOnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3919966")
            startActivity(intent)
        }

        binding.btnChuquisaca.setOnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3920177")
            startActivity(intent)
        }
        binding.btnChuquisaca.setOnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3903319")
            startActivity(intent)
        }

        binding.btnSantaCruz.setOnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "6356861")
            startActivity(intent)
        }
        binding.btnBeni.setOnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3923172")
            startActivity(intent)
        }
        binding.btnPando.setOnClickListener {
            val intent = Intent(this, InfoClima::class.java)
            intent.putExtra(TAG, "3908600")
            startActivity(intent)
        }
    }
}





