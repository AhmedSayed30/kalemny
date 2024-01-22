package com.example.kalemny

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.kalemny.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        changeLocale()
        showFragment(MainFragment())
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    private fun changeLocale() {
        val local = Locale("ar")
        Locale.setDefault(local)
        val config = Configuration()
        config.setLocale(local)
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
    }
}