package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityHalamandaftarBinding
import com.example.grandfinder.databinding.ActivityHalamanmasukBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class halamandaftar : AppCompatActivity() {
    private lateinit var binding: ActivityHalamandaftarBinding
    private lateinit var firebaseDatabase: FirebaseDatabase
    private lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHalamandaftarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseDatabase = FirebaseDatabase.getInstance()
        databaseReference = firebaseDatabase.reference.child("users")

        binding.btsignup.setOnClickListener {
            val signupUsername = binding.etnama.text.toString()
            val signupPassword = binding.etpass.text.toString()

            if (signupPassword.isNotEmpty() && signupUsername.isNotEmpty()){
                signup(signupUsername, signupPassword)
            }else{
                Toast.makeText(this,"Jangan Sampai Ada Yang Kosong", Toast.LENGTH_SHORT).show()
            }
        }

        binding.TVdaftar.setOnClickListener{
            startActivity(Intent(this@halamandaftar, halamanmasuk::class.java))
            finish()
        }
    }

    private fun signup(username: String, password: String){
        databaseReference.orderByChild("username").equalTo(username).addListenerForSingleValueEvent(object :
            ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                if (!dataSnapshot.exists()){
                    val id = databaseReference.push().key ?: return
                    val userData = userdata(id, username, password)
                    databaseReference.child(id).setValue(userData).apply {
                        Toast.makeText(this@halamandaftar, "Berhasil Sign Up", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this@halamandaftar, halamanmasuk::class.java))
                        finish()
                    }
                } else {
                    Toast.makeText(this@halamandaftar, "User Sudah Ada", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@halamandaftar, "Database error : ${error.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}