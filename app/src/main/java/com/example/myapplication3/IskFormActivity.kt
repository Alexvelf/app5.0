package com.example.myapplication3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView

class IskFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isk_form)
        val button = findViewById<Button>(R.id.button11)
        button.setOnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/uc?export=download&confirm=no_antivirus&id=1rF9TfQQRq0SH9OZymJbhk3hNRR_y5coA")
            )
            startActivity(i)
        }


        val text = findViewById<TextView>(R.id.textView5)
        text.setMovementMethod(ScrollingMovementMethod())
        text.movementMethod = LinkMovementMethod.getInstance()
    }
}