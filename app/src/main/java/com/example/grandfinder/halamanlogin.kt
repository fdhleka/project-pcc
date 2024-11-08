package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityHalamanloginBinding

class halamanlogin : AppCompatActivity() {
    private lateinit var binding: ActivityHalamanloginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHalamanloginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur klik listener untuk tombol dengan binding
        binding.btmasuk.setOnClickListener {
            val intent = Intent(this, halamanmasuk::class.java)
            startActivity(intent)
        }
        binding.btdaftar.setOnClickListener {
            val intent = Intent(this, halamandaftar::class.java)
            startActivity(intent)
        }
        binding.btmasukadmin.setOnClickListener {
            val intent = Intent(this, loginadmin::class.java)
            startActivity(intent)
        }
        }
    }
