package com.example.secondscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.edtInput)
        val button = findViewById<Button>(R.id.btnNext)

        button.setOnClickListener {
            val name = nameInput.text.toString()

            val intent = Intent(this, secondscreen::class.java)
            intent.putExtra("userName", name)

            startActivity(intent)
        }

    }
}