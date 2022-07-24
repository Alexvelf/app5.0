package com.example.myapplication3
import android.content.Intent
import android.net.Uri
import android.net.Uri.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
                Uri.parse("https://www.dropbox.com/s/aahi0wvgg2kkj2m/%D0%9E%D0%B1%D1%80%D0%B0%D0%B7%D0%B5%D1%86%20%D0%B8%D1%81%D0%BA%D0%B0.pdf?dl=0")
            )
            startActivity(i)
        }


        val text = findViewById<TextView>(R.id.textView5)
        text.setMovementMethod(ScrollingMovementMethod())
    }
}