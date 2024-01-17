package com.example.kalemny

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kalemny.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCall.setOnClickListener {
            val intent = Intent(requireActivity(),::class.java)
            startActivity(intent)
        }
        binding.btnWallet.setOnClickListener {
            val intent = Intent(requireActivity(),VerificationActivity::class.java)
            startActivity(intent)
        }
        binding.btnBay.setOnClickListener {
            val intent = Intent(requireActivity(),VerificationActivity::class.java)
            startActivity(intent)
        }
        binding.btnWallet.setOnClickListener {
            val intent = Intent(requireActivity(),VerificationActivity::class.java)
            startActivity(intent)
        }
    }

}