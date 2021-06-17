package com.dan.siimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.daimajia.androidanimations.library.Techniques
import com.viksaa.sssplash.lib.activity.AwesomeSplash
import com.viksaa.sssplash.lib.cnst.Flags
import com.viksaa.sssplash.lib.model.ConfigSplash
import com.dan.siimobile.R.*

class Splash : AwesomeSplash() {
    override fun initSplash(configSplash: ConfigSplash?) {
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        if (configSplash != null) {
            configSplash.backgroundColor = color.bluetec
            configSplash.animCircularRevealDuration = 900
            configSplash.revealFlagX = Flags.REVEAL_LEFT
            configSplash.revealFlagY = Flags.REVEAL_BOTTOM

            configSplash.titleSplash = "Sistema Integral de Información"
            configSplash.titleTextColor = color.white
            configSplash.titleTextSize = 20f
            configSplash.animTitleDuration = 1200
            configSplash.animTitleTechnique = Techniques.FadeIn
            configSplash.logoSplash = drawable.itpn

        }

    }

    override fun animationsFinished() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }


}