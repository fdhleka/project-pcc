package com.example.grandfinder

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityHalamanloginBinding
import com.example.grandfinder.databinding.ActivityPanduanBinding

class panduan : AppCompatActivity() {
    private lateinit var binding: ActivityPanduanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPanduanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}