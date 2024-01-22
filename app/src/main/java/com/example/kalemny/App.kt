package com.example.kalemny

import android.app.Application
import android.content.res.Configuration
import java.util.Locale

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        val local = Locale("ar")
        Locale.setDefault(local)
        Configuration().setLocale(local)
    }
}