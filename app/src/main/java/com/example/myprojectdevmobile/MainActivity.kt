package com.example.myprojectdevmobile


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginButton = findViewById<Button>(R.id.button)
        val createAccountButton = findViewById<Button>(R.id.button2)
        val emailEditText = findViewById<EditText>(R.id.etLogin)
        val passwordEditText = findViewById<EditText>(R.id.etPass)
        createAccountButton.setOnClickListener {
            val intent =Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }




        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()



            if (isValidEmail(email) && password.length >= 3) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                // Afficher un message d'erreur si les conditions ne sont pas remplies
                Toast.makeText(
                    this,
                    "login invalide ou mot de passe trop court",
                    Toast.LENGTH_SHORT
                ).show()
            }
            val intent = Intent(this@MainActivity, Home_1::class.java)
            startActivity(intent)

        }}

    private fun isValidEmail(email: String): Boolean {

        val emailPattern = Regex("[a-zA-Z0-9._%+-]+@gmail\\.com")

        return email.matches(emailPattern)
    }}





