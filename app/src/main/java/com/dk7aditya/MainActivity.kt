package com.dk7aditya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.MainTheme)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextButton: Button = findViewById(R.id.btnStart)
        val userName: TextView = findViewById(R.id.userName)
        nextButton.setOnClickListener{
            if(userName.text.isEmpty()){
                Toast.makeText(this, "Your name is mandatory.", Toast.LENGTH_SHORT).show()
            }else{
                val chooseQuizIntent: Intent = Intent(this, ChooseQuizActivity::class.java)
                chooseQuizIntent.putExtra("username", userName.text)
                startActivity(chooseQuizIntent)
                overridePendingTransition(0,0)
            }
        }

    }
}