package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TestQuestion2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_question2)
        val noButton = findViewById<Button>(R.id.button)
        noButton.setOnClickListener {
            val intent = Intent(this, TestAnswer1::class.java)
            intent.putExtra("button", 1)
            startActivity(intent)
        }
        val yesButton = findViewById<Button>(R.id.button2)
        yesButton.setOnClickListener {
            val intent = Intent(this, TestInfo1::class.java)
            intent.putExtra("button", 2)
            startActivity(intent)
        }
    }
}