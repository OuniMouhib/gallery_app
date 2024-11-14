package com.example.myprojectdevmobile
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myprojectdevmobile.MainActivity
import com.example.myprojectdevmobile.Home_1

import com.example.myprojectdevmobile.R

public class MainActivity2 :AppCompatActivity() {

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val emailEditText = findViewById<EditText>(R.id.email)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val createButton = findViewById<Button>(R.id.button3)


            createButton.setOnClickListener {
                val email = emailEditText.text.toString()
                val password = passwordEditText.text.toString()

                if (isValidEmail(email) && password.length >= 3) {
                    val intent = Intent(this, Home_1::class.java)
                    startActivity(intent)
                } else {
                    // Afficher un message d'erreur si les conditions ne sont pas remplies
                    Toast.makeText(
                        this,
                        "Adresse e-mail invalide ou mot de passe trop court",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }


    }

    private fun isValidEmail(email: String): Boolean {
        val emailPattern = Regex("[a-zA-Z0-9._%+-]+@gmail\\.com")

        return email.matches(emailPattern)
    }


