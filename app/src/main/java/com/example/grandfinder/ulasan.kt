package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityHalamanloginBinding
import com.example.grandfinder.databinding.ActivityUlasanBinding

class ulasan : AppCompatActivity() {
    private lateinit var binding: ActivityUlasanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUlasanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur klik listener untuk tombol dengan binding
        binding.addReviewButton.setOnClickListener {
            val intent = Intent(this, formulasan::class.java)
            startActivity(intent)
        }
    }
}