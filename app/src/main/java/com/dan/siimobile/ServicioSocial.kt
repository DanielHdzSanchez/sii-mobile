package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class ServicioSocial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicio_social)
        val back = findViewById<ImageView>(R.id.btnBackSSH)
        back.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
            finish()
            Animatoo.animateSlideRight(this)
        }
    }
}