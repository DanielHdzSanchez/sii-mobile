package com.dan.siimobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itpn = findViewById<ImageView>(R.id.logoitpn)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, Feed::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, itpn as View, "itpn")
            startActivity(intent, options.toBundle())
        }
    }
}