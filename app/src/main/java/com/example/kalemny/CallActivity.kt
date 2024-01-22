package com.example.kalemny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kalemny.databinding.ActivityCallBinding

class CallActivity : AppCompatActivity() {
    private val binding: ActivityCallBinding by lazy {
        ActivityCallBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            igBack.setOnClickListener {
                finish()
            }
            firstItem.btnCall.setOnClickListener {
                startActivity(Intent(this@CallActivity, CallingActivity::class.java))
            }

            secondItem.btnCall.setOnClickListener {
                startActivity(Intent(this@CallActivity, CallingActivity::class.java))
            }

            thirdItem.btnCall.setOnClickListener {
                startActivity(Intent(this@CallActivity, CallingActivity::class.java))
            }

            fourthItem.btnCall.setOnClickListener {
                startActivity(Intent(this@CallActivity, CallingActivity::class.java))
            }
        }
    }
}