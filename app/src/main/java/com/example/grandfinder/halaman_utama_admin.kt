package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityHalamanUtamaAdminBinding
import com.example.grandfinder.databinding.ActivityHalamanloginBinding

class halaman_utama_admin : AppCompatActivity() {
    private lateinit var binding: ActivityHalamanUtamaAdminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamanUtamaAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur klik listener untuk tombol dengan binding
        binding.imagebuttonislamadmin.setOnClickListener {
            val intent = Intent(this, create_data::class.java)
            startActivity(intent)
        }
        binding.imagebuttonkristenadmin.setOnClickListener {
            val intent = Intent(this, halamandaftar::class.java)
            startActivity(intent)
        }
        binding.imagebuttonpanduanadmin.setOnClickListener {
            val intent = Intent(this, panduan::class.java)
            startActivity(intent)
        }
    }
}

