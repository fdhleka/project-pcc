package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityHalamanKategoriIslamBinding
import com.example.grandfinder.databinding.ActivityHalamanloginBinding

class halamanKategoriIslam : AppCompatActivity() {
    private lateinit var binding: ActivityHalamanKategoriIslamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamanKategoriIslamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur klik listener untuk tombol dengan binding
        binding.makam1.setOnClickListener {
            val intent = Intent(this,halamandetailmakam::class.java)
            startActivity(intent)
        }
        binding.makam2.setOnClickListener {
            val intent = Intent(this,halamandetailmakam1::class.java)
            startActivity(intent)
        }
        binding.makam3.setOnClickListener {
            val intent = Intent(this,halamandetailmakam2::class.java)
            startActivity(intent)
        }
        binding.makam4.setOnClickListener {
            val intent = Intent(this,halamandetailmakam3::class.java)
            startActivity(intent)
        }
        }
    }
