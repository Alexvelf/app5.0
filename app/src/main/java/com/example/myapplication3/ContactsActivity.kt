package com.example.myapplication3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ContactsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contacts)

        // Creating web link activity.
        val webText: TextView = findViewById(R.id.textView8);
        webText.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://ГИБДД.рф/"))
            startActivity(i)
        }

        // кнопка для возвращения назад
        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener {
            this.finish()
        }

        val home = findViewById<Button>(R.id.home)
        home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }
}