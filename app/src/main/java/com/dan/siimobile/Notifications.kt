package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Notifications : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)
        val back = findViewById<ImageView>(R.id.btnBackNH)
        back.setOnClickListener {
            if (intent.getStringExtra("source") == "feed") {
                startActivity(Intent(this, Feed::class.java))
                finish()
                Animatoo.animateSlideRight(this)
            }
            else {
                startActivity(Intent(this, Profile::class.java))
                finish()
                Animatoo.animateSlideRight(this)
            }
        }
    }

    override fun onBackPressed() {
        if (intent.getStringExtra("source") == "feed") {
            startActivity(Intent(this, Feed::class.java))
            finish()
            Animatoo.animateSlideRight(this)
        }
        else {
            startActivity(Intent(this, Profile::class.java))
            finish()
            Animatoo.animateSlideRight(this)
        }
    }
}