package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Residence : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_residence)
        val back = findViewById<ImageView>(R.id.btnBackRH)
        back.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
            finish()
            Animatoo.animateSlideRight(this)
        }
    }
}