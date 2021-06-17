package com.dan.siimobile

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityOptionsCompat
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class Grades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grades)
        val back = findViewById<ImageView>(R.id.btnBackGH)
        val grades = findViewById<LinearLayout>(R.id.cardGrades)
        back.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            val options = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, grades as View, "cardGrades")
            startActivity(intent, options.toBundle())
        }

        val grade1 = findViewById<CardView>(R.id.grade1)
        val grade2 = findViewById<CardView>(R.id.grade2)
        val grade3 = findViewById<CardView>(R.id.grade3)
        val grade4 = findViewById<CardView>(R.id.grade4)
        val grade5 = findViewById<CardView>(R.id.grade5)
        val grade6 = findViewById<CardView>(R.id.grade6)
        val grade7 = findViewById<CardView>(R.id.grade7)


        grade1.setOnClickListener {
            showGrade("Diseño de aplicaciones móviles", 100)
        }
        grade2.setOnClickListener {
            showGrade("Diseño e Implementación de Sitios Web", 90)
        }
        grade3.setOnClickListener {
            showGrade("Graficación", 100)
        }
        grade4.setOnClickListener {
            showGrade("Programación Lógica y Funcional", 80)
        }
        grade5.setOnClickListener {
            showGrade("Administración de Redes", 0)
        }
        grade6.setOnClickListener {
            showGrade("Sistemas Programables", 100)
        }
        grade7.setOnClickListener {
            showGrade("Taller de Investigación II", 100)
        }
    }

    private fun showGrade(subject: String, grade: Int) {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setMessage("""
            Asignatura: $subject
            Calificación: $grade
            Docente: Marcos Reyes Cárdenas
            Créditos: 5
        """.trimIndent())
                .setCancelable(false)
                // positive button text and action
                .setPositiveButton("OK") { _, _ ->
                    //finish()
                }
        val alert = dialogBuilder.create()
        alert.setTitle("Detalles")
        alert.show()
    }
}