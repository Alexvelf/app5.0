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
<<<<<<< HEAD
=======
import com.example.myapplication3.R.*
>>>>>>> 1dd26429005ba346adffec304c66e08294c72f4f
>>>>>>> 0f4c5375bb5542d1336a7c3abfa402748b72e0e0

class MainActivity : AppCompatActivity() {
    val db = DataBase(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< HEAD
        db.open()   // открываем базу данных для работы с ней
<<<<<<< HEAD
        val var_for_DTP_cat_button = findViewById<Button>(R.id.button_for_DTP_car)
        val var_for_DTP_kik_button = findViewById<Button>(R.id.button_for_DTP_kik)
        val var_for_PDD_cat_button = findViewById<Button>(R.id.button_for_PDD_car)
        val var_for_PDD_kik_button = findViewById<Button>(R.id.button_for_PDD_kik)
        val var_for_GIBDD = findViewById<Button>(R.id.button8)
=======
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
>>>>>>> 0f4c5375bb5542d1336a7c3abfa402748b72e0e0

        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this,button)
            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_dict ->
                    {
                        val intent = Intent(this, MainActivity3::class.java)
                        startActivity(intent)
                    }
                    R.id.action_convers ->
                        Toast.makeText(this@MainActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.action_contacts ->
                        Toast.makeText(this@MainActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                }
                true
            })
            popupMenu.show()
        }

        var_for_DTP_cat_button.setOnClickListener {
            val intent = Intent(this, SubquestionsAndAnswers::class.java)
            intent.putExtra("button", 1)
            // номер кнопки передается в следующий Activity (т. е. список вопросов),
            // чтобы можно было понять, какая кнопка была нажата, и вывести нужные вопросы из базы
            startActivity(intent)
        }

        var_for_DTP_kik_button.setOnClickListener {
            val intent = Intent(this, SubquestionsAndAnswers::class.java)
            intent.putExtra("button", 2)
            startActivity(intent)
        }

        var_for_PDD_cat_button.setOnClickListener {
            val intent = Intent(this, SubquestionsAndAnswers::class.java)
            intent.putExtra("button", 3)
            startActivity(intent)
        }

        var_for_PDD_kik_button.setOnClickListener {
            val intent = Intent(this, SubquestionsAndAnswers::class.java)
            intent.putExtra("button", 4)
            startActivity(intent)
        }

        var_for_GIBDD.setOnClickListener {
            val intent = Intent(this, SubquestionsAndAnswers::class.java)
            intent.putExtra("button", 5)
            startActivity(intent)
        }
    }

    // закрываем базу при окончании работы activity
    override fun onDestroy() {
        super.onDestroy()
        db.close()
    }
<<<<<<< HEAD

    fun home_activity(view: View){
        val Home_acitivity=Intent(this,MainActivity::class.java)
        startActivity(Home_acitivity)
    }
=======
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
>>>>>>> 2e94e01c22892f623d82b5e00e20da28eae5070d
}