package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val back = findViewById<ImageView>(R.id.btnBackAH)
        back.setOnClickListener {
            startActivity(Intent(this, Feed::class.java))
            finish()
            Animatoo.animateSlideRight(this)
        }
        val btnNotifications = findViewById<ImageView>(R.id.btnNotifications)
        btnNotifications.setOnClickListener {
            startActivity(Intent(this, Notifications::class.java).apply {
                putExtra("source", "profile")
            })
            finish()
        }
        val grades = findViewById<CardView>(R.id.cardGrades)
        grades.setOnClickListener {
            startActivity(Intent(this, Grades::class.java))
            finish()
        }
    }
}