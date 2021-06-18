package com.dan.siimobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import com.google.android.material.textfield.TextInputEditText
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itpn = findViewById<ImageView>(R.id.logoitpn)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val nroControl = findViewById<TextInputEditText>(R.id.nroControl)
            val password = findViewById<TextInputEditText>(R.id.password)
            if (Pattern.matches("[0-9]{8}", nroControl.text.toString()))
            {
                if (password.text.toString() != "" && Pattern.matches(".{8,}", password.text.toString()))
                {
                    nroControl.error = null
                    val intent = Intent(this, Feed::class.java)
                    val options = ActivityOptionsCompat
                            .makeSceneTransitionAnimation(this, itpn as View, "itpn")
                    startActivity(intent, options.toBundle())
                }
                else
                    password.error = "Ingresa una contraseña válida"
            }
            else {
                nroControl.error = "Ingresa un número de control válido"
            }
        }
    }

    override fun onBackPressed() {
        finishAffinity()
    }
}