package com.example.grandfinder

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityFormulasanBinding
import com.example.grandfinder.databinding.ActivityUlasanBinding

class formulasan : AppCompatActivity() {
    private lateinit var binding: ActivityFormulasanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFormulasanBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}