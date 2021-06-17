package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Feed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)
        val student = findViewById<ImageView>(R.id.studentPhoto)
        val btnNotifications = findViewById<ImageView>(R.id.btnNotificationsFeed)
        student.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, student as View, "studentPhoto")
            startActivity(intent, options.toBundle())
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