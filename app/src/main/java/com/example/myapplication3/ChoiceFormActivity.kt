package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ChoiceFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice_form)
        val buttonIsk = findViewById<Button>(R.id.button12)
        buttonIsk.setOnClickListener {
            val intent = Intent(this, IskFormActivity::class.java)
            startActivity(intent)
        }

        val buttonComplaint = findViewById<Button>(R.id.button13)
        buttonComplaint.setOnClickListener {
            val intent = Intent(this, ComplaintFormActivity::class.java)
            startActivity(intent)
        }
    }
}