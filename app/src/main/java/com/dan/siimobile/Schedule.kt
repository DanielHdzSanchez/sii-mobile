package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.app.ActivityOptionsCompat
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Schedule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        val back = findViewById<ImageView>(R.id.btnBackSH)
        val cardSchedule = findViewById<LinearLayout>(R.id.cardSchedule)
        back.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, cardSchedule as View, "cardSchedule")
            startActivity(intent, options.toBundle())
        }
    }
}