package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
<<<<<<< HEAD
=======
import com.example.myapplication3.R.*
>>>>>>> 1dd26429005ba346adffec304c66e08294c72f4f

class MainActivity : AppCompatActivity() {
    val db = DataBase(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< HEAD
        db.open()   // открываем базу данных для работы с ней
//        db.execute(DROP_TABLE_NODE)
//        db.execute(DROP_TABLE_QUESTION)
//        db.execute(CREATE_TABLE_QUESTION)
//        db.execute(CREATE_TABLE_NODE)
//        db.execute(FILL_QUESTION)
//        db.execute(FILL_NODE)
        val button1 = findViewById<Button>(R.id.button1_for_car)
        val button2 = findViewById<Button>(R.id.button1_for_kik)
        val button4 = findViewById<Button>(R.id.button2_for_car)
        val button5 = findViewById<Button>(R.id.button2_for_kik)
        val button3 = findViewById<Button>(R.id.button_for_hot)

        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_dict ->
                        Toast.makeText(this@MainActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.action_convers ->
                        Toast.makeText(this@MainActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.action_contacts ->
=======
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button)
            popupMenu.menuInflater.inflate(menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    id.action_dict ->
                        Toast.makeText(this@MainActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    id.action_convers ->
                        Toast.makeText(this@MainActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    id.action_contacts ->
>>>>>>> 1dd26429005ba346adffec304c66e08294c72f4f
                        Toast.makeText(this@MainActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                }
                true
            })
            popupMenu.show()
<<<<<<< HEAD
        }

        button1.setOnClickListener {
            val intent = Intent(this, QuestionsList::class.java)
            intent.putExtra("button", 1)    // номер кнопки передается в следующий Activity (т. е. список вопросов), чтобы можно было понять, какая кнопка была нажата, и вывести нужные вопросы из базы
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, QuestionsList::class.java)
            intent.putExtra("button", 2)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, QuestionsList::class.java)
            intent.putExtra("button", 3)
            startActivity(intent)
        }
    }

    // закрываем базу при окончании работы activity
    override fun onDestroy() {
        super.onDestroy()
        db.close()
    }
=======
        }
    }

>>>>>>> 1dd26429005ba346adffec304c66e08294c72f4f
    fun content_activity(view: View) {
        val content_activ=Intent(this,ContentActivity::class.java)
        startActivity(content_activ)
    }
    fun third_activity(view: View){
        val third_activ=Intent(this,MainActivity3::class.java)
        startActivity(third_activ)
    }
<<<<<<< HEAD

=======
>>>>>>> 1dd26429005ba346adffec304c66e08294c72f4f
}