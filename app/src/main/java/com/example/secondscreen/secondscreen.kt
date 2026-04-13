package com.example.secondscreen

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class secondscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_secondscreen)

        val textView = findViewById<TextView>(R.id.txtResult)
        val backButton = findViewById<Button>(R.id.btnBack)
        val button = findViewById<Button>(R.id.btnResult)

        //result button
        val name = intent.getStringExtra("userName")

        button.setOnClickListener {
            textView.text = "Hello, $name"
        }


        //back button
        backButton.setOnClickListener {
            finish()
        }
    }
}