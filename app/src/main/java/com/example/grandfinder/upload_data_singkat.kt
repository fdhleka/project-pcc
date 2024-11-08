package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityCreateDataBinding
import com.example.grandfinder.databinding.ActivityUploadDataSingkatBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class upload_data_singkat : AppCompatActivity() {
    private lateinit var binding: ActivityUploadDataSingkatBinding
    private lateinit var databaseReference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUploadDataSingkatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btcreatesing.setOnClickListener {
            val name = binding.namamakamsingkat.text.toString()
            val alamat = binding.alamatmakamsingkat.text.toString()

            databaseReference = FirebaseDatabase.getInstance().getReference("namamakam")
            binding.namamakamsingkat.text.clear()
            binding.alamatmakamsingkat.text.clear()

            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, upload_data_singkat::class.java)
            startActivity(intent)
            finish()
        }
    }
}
