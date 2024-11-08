package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityHalamandetailmakamBinding
import com.example.grandfinder.databinding.ActivityHalamanloginBinding

class halamandetailmakam : AppCompatActivity() {
    private lateinit var binding: ActivityHalamandetailmakamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamandetailmakamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur klik listener untuk tombol dengan binding
        binding.btulasan.setOnClickListener {
            val intent = Intent(this, ulasan::class.java)
            startActivity(intent)
        }
    }
}