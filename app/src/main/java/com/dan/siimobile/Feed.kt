package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Feed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)
        val btnAccount = findViewById<ImageView>(R.id.btnAccount)
        val btnNotifications = findViewById<ImageView>(R.id.btnNotificationsFeed)
        btnAccount.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
            finish()
            Animatoo.animateSlideUp(this)
        }
        btnNotifications.setOnClickListener {
            startActivity(Intent(this, Notifications::class.java).apply {
                putExtra("source", "feed")
            })
            finish()
        }
    }
}