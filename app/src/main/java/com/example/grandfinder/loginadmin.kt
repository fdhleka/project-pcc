package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.grandfinder.databinding.ActivityLoginadminBinding

class loginadmin : AppCompatActivity() {
    private lateinit var binding: ActivityLoginadminBinding

    // Define fixed credentials
    private val fixedUsername = "admin"
    private val fixedPassword = "admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginadminBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up login button listener
        binding.btlogin.setOnClickListener {
            val inputUsername = binding.etnamaadmin.text.toString()
            val inputPassword = binding.etpaswordadmin.text.toString()

            // Check if entered credentials match the fixed credentials
            if (inputUsername == fixedUsername && inputPassword == fixedPassword) {
                // Login successful - navigate to TargetActivity
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, halaman_utama_admin::class.java)
                startActivity(intent)
            } else {
                // Login failed
                Toast.makeText(this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
