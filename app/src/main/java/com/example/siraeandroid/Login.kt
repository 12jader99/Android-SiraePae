package com.example.siraeandroid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.siraeandroid.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {

            val correo = binding.etCorreo.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            // Validar campos vacíos
            if (correo.isEmpty()) {
                binding.etCorreo.error = "Ingrese su correo"
                binding.etCorreo.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                binding.etPassword.error = "Ingrese su contraseña"
                binding.etPassword.requestFocus()
                return@setOnClickListener
            }

            // Validar usuario
            when {
                correo == "admin@sirae.com" && password == "123456" -> {
                    Toast.makeText(
                        this,
                        "Bienvenido Administrador",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                correo == "supervisor@sirae.com" && password == "123456" -> {
                    Toast.makeText(
                        this,
                        "Bienvenido Supervisor",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                correo == "manipuladora@sirae.com" && password == "123456" -> {
                    Toast.makeText(
                        this,
                        "Bienvenida Manipuladora",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                else -> {
                    Toast.makeText(
                        this,
                        "Correo o contraseña incorrectos",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }

        binding.txtOlvido.setOnClickListener {
            Toast.makeText(
                this,
                "Comuníquese con el administrador del sistema.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}