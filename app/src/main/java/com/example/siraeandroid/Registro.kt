package com.example.siraeandroid

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.siraeandroid.databinding.ActivityMainBinding
import com.example.siraeandroid.databinding.ActivityRegistroBinding

class Registro : AppCompatActivity() {

    private lateinit var  binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener {

            val nombre = binding.etNombre.text.toString().trim()
            val cedula = binding.etCedula.text.toString().trim()
            val correo = binding.etCorreo.text.toString().trim()
            val password = binding.etContrasena.text.toString().trim()

            if (nombre.isEmpty() || cedula.isEmpty() || correo.isEmpty() || password.isEmpty()) {

                Toast.makeText(this, "Que complete todos los campos", Toast.LENGTH_SHORT).show()

            } else {

                    Toast.makeText(this, "Usuario registrado", Toast.LENGTH_SHORT).show()

            }
        }



    }



}








