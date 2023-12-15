package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnstart : Button= findViewById(R.id.startButton)
        val edittext : EditText = findViewById(R.id.etName)
        btnstart.setOnClickListener {
            if(edittext.text.isEmpty()){
                // Prompting to enter the name //
                Toast.makeText(this , "Please enter your name" , Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this , MyQuestions::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}