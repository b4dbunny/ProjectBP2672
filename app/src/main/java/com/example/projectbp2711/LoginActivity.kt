package com.example.projectbp2711

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //instance
        val btnLogin: Button = findViewById(R.id.buttonLogin)
        val txtUsername: EditText = findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)
        val logModel = LoginModel()

        //event saat button Login click
        btnLogin.setOnClickListener{
            //input
            logModel.username = txtUsername.text.toString()
            logModel.password = txtPassword.text.toString()
            //login cek
            if (logModel.loginCheck() == true){
                //call message
                val intentHome = Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Login gagal, cek username dan password" ,
                Toast.LENGTH_SHORT).show()
            }
        }
    }
}