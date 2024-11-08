package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityHalamanloginBinding
import com.example.grandfinder.databinding.ActivityHalamanutamaBinding

class Halamanutama : AppCompatActivity() {
    private lateinit var binding: ActivityHalamanutamaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHalamanutamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur klik listener untuk tombol dengan binding
        binding.imagebuttonislam.setOnClickListener {
            val intent = Intent(this, halamanKategoriIslam::class.java)
            startActivity(intent)
        }
        binding.imagebuttonkristen.setOnClickListener {
            val intent = Intent(this, halamankategorikristen::class.java)
            startActivity(intent)
        }
        binding.imagebuttonpanduan.setOnClickListener {
            val intent = Intent(this, panduan::class.java)
            startActivity(intent)
        }
    }
}