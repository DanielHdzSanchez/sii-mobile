package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.app.ActivityOptionsCompat
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Residence : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_residence)
        val back = findViewById<ImageView>(R.id.btnBackRH)
        val residence = findViewById<LinearLayout>(R.id.cardResidence)
        back.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, residence as View, "cardResidence")
            startActivity(intent, options.toBundle())
        }
    }
}