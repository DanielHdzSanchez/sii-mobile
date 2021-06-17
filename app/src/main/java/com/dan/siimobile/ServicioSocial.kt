package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.app.ActivityOptionsCompat
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class ServicioSocial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicio_social)
        val back = findViewById<ImageView>(R.id.btnBackSSH)
        val social = findViewById<LinearLayout>(R.id.cardSocial)
        back.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, social as View, "cardSocial")
            startActivity(intent, options.toBundle())
        }
    }
}