package com.example.kalemny

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kalemny.databinding.ActivityVerificationBinding
import com.example.kalemny.databinding.FragmentCallBinding
import com.example.kalemny.databinding.FragmentMainBinding

class CallFragment : Fragment() {
    private lateinit var binding: FragmentCallBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_call, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.igBack.setOnClickListener {
            val intent = Intent(requireActivity(),MainFragment::class.java)
            startActivity(intent)
        }
        binding.item1.setOnClickListener {
            val intent = Intent(requireActivity(),CallingActivity::class.java)
            startActivity(intent)
        }
        binding.item2.setOnClickListener {
            val intent = Intent(requireActivity(),CallingActivity::class.java)
            startActivity(intent)
        }
        binding.item3.setOnClickListener {
            val intent = Intent(requireActivity(),CallingActivity::class.java)
            startActivity(intent)
        }
    }
}