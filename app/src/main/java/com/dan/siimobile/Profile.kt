package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityOptionsCompat
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val back = findViewById<ImageView>(R.id.btnBackAH)
        val student = findViewById<CardView>(R.id.studentPhoto)
        back.setOnClickListener {
            val intent = Intent(this, Feed::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, student as View, "studentPhoto")
            startActivity(intent, options.toBundle())
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
            val intent = Intent(this, Grades::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, grades as View, "cardGrades")
            startActivity(intent, options.toBundle())
        }

        val schedule = findViewById<CardView>(R.id.cardSchedule)
        schedule.setOnClickListener {
            val intent = Intent(this, Schedule::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, schedule as View, "cardSchedule")
            startActivity(intent, options.toBundle())

        }

        val social = findViewById<CardView>(R.id.cardSocial)
        social.setOnClickListener {
            val intent = Intent(this, ServicioSocial::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, social as View, "cardSocial")
            startActivity(intent, options.toBundle())
        }

        val residence = findViewById<CardView>(R.id.cardResidence)
        residence.setOnClickListener {
            val intent = Intent(this, Residence::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, residence as View, "cardResidence")
            startActivity(intent, options.toBundle())
        }

        val reticula = findViewById<CardView>(R.id.cardReticule)
        reticula.setOnClickListener {
            val intent = Intent(this, Progress::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, reticula as View, "cardReticule")
            startActivity(intent, options.toBundle())
        }
    }

    override fun onBackPressed() {
        val student = findViewById<CardView>(R.id.studentPhoto)
        val intent = Intent(this, Feed::class.java)
        val options = ActivityOptionsCompat
                .makeSceneTransitionAnimation(this, student as View, "studentPhoto")
        startActivity(intent, options.toBundle())
    }
}