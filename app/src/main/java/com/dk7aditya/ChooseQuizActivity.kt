package com.dk7aditya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ChooseQuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.MainTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_quiz)
        val name: String? = intent.getStringExtra("username")
        val optionOne: Button = findViewById(R.id.optionOne)
        val optionTwo: Button = findViewById(R.id.optionTwo)
        val optionThree: Button = findViewById(R.id.optionThree)
        optionOne.setOnClickListener{
            val startQuizIntent: Intent = Intent(this, QuizActivity::class.java)
            startQuizIntent.putExtra("username", name)
            startQuizIntent.putExtra("option", 1)
            startActivity(startQuizIntent)
            overridePendingTransition(0,0)
        }
        optionTwo.setOnClickListener{
            Toast.makeText(this, "Feature under construction", Toast.LENGTH_SHORT).show()
        }
        optionThree.setOnClickListener{
            Toast.makeText(this, "Feature under construction", Toast.LENGTH_SHORT).show()
        }
    }
}