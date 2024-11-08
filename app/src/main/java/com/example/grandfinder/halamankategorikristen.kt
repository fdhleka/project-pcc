package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityHalamanKategoriIslamBinding
import com.example.grandfinder.databinding.ActivityHalamankategorikristenBinding

class halamankategorikristen : AppCompatActivity() {
    private lateinit var binding: ActivityHalamankategorikristenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamankategorikristenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.makam1kristen.setOnClickListener {
            val intent = Intent(this,halamandetailmakamkristen1::class.java)
            startActivity(intent)
        }

    }
}