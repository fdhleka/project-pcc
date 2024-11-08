package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityCreateDataBinding
import com.example.grandfinder.databinding.ActivityHalamanUtamaAdminBinding
import com.example.grandfinder.databinding.ActivityUploadDataSingkatBinding
import com.google.firebase.database.DatabaseReference

class create_data : AppCompatActivity() {
    private lateinit var binding: ActivityCreateDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCreateDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.add.setOnClickListener {
            val intent = Intent(this, upload_data_singkat::class.java)
            startActivity(intent)

        }
    }
}