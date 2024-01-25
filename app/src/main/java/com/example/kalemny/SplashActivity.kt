package com.example.kalemny

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import java.util.Locale

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        changeLocale()
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 2000)
    }

    private fun changeLocale() {
        val local = Locale("ar")
        Locale.setDefault(local)
        val config = Configuration()
        config.setLocale(local)
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
    }
}