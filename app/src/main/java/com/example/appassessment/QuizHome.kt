package com.example.appassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class QuizHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_home)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
                var intent = Intent(this,QuestionActivity::class.java)
                startActivity(intent)
                finish()
        }

        val goBack = findViewById<Button>(R.id.goBack)
        goBack.setOnClickListener {
                var intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
        }
    }
}