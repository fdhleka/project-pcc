package com.example.grandfinder

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grandfinder.databinding.ActivityHalamanmasukBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class halamanmasuk : AppCompatActivity() {
    private lateinit var binding: ActivityHalamanmasukBinding
    private lateinit var firebaseDatabase: FirebaseDatabase
    private lateinit var databaseReference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHalamanmasukBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseDatabase = FirebaseDatabase.getInstance()
        databaseReference = firebaseDatabase.reference.child("users")

        binding.btlogin.setOnClickListener{
            val loginUsername = binding.etnama.text.toString()
            val loginpassword = binding.etpasword.text.toString()

            if (loginpassword.isNotEmpty() && loginpassword.isNotEmpty()){
                loginuser(loginUsername, loginpassword)
            }else{
                Toast.makeText(this, "Jangan sampai ada yang kosong", Toast.LENGTH_SHORT).show()
            }
        }
        binding.TVMasuk.setOnClickListener{
            startActivity(Intent(this@halamanmasuk, halamandaftar::class.java))
        }
    }
    private fun loginuser(username : String, password: String){
        databaseReference.orderByChild("username").equalTo(username).addListenerForSingleValueEvent(object : ValueEventListener{
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                if (dataSnapshot.exists()){
                    for (userSnapshot in dataSnapshot.children){
                        val userdata = userSnapshot.getValue(userdata::class.java)
                        if (userdata != null && userdata.password == password){
                            Toast.makeText(this@halamanmasuk, "Berhasil Masuk", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this@halamanmasuk,Halamanutama::class.java))
                            finish()
                            return
                        }
                    }
                }
                Toast.makeText(this@halamanmasuk, "Login Gagal", Toast.LENGTH_SHORT).show()
            }
            override fun onCancelled(erorr : DatabaseError){
                Toast.makeText(this@halamanmasuk , "Database error : ${erorr.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
