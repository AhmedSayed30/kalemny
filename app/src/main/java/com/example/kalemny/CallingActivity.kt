package com.example.kalemny

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kalemny.databinding.ActivityCallingBinding
import com.example.kalemny.databinding.ActivityVerificationBinding

class CallingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCallingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCallingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.igBack.setOnClickListener {
            finish()
        }
    }
}