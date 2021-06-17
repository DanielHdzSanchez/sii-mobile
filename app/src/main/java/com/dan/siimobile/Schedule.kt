package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Schedule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        val back = findViewById<ImageView>(R.id.btnBackSH)
        back.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
            finish()
            Animatoo.animateSlideRight(this)
        }
    }
}