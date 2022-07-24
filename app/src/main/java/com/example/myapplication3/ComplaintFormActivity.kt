package com.example.myapplication3
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView

class ComplaintFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complaint_form)
        val button = findViewById<Button>(R.id.button11)
        button.setOnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/uc?export=download&confirm=no_antivirus&id=1YqbAwwbjjjYurH9hDO_d1eUaXLQFtUwt")
            )
            startActivity(i)
        }

        val text = findViewById<TextView>(R.id.textView5)
        text.setMovementMethod(ScrollingMovementMethod())
    }
}