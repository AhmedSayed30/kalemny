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
    private val binding: FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCall.setOnClickListener {
            startActivity(Intent(requireActivity(), CallActivity::class.java))
        }
        binding.btnWallet.setOnClickListener {
            val intent = Intent(requireActivity(), VerificationActivity::class.java)
            startActivity(intent)
        }
        binding.btnBay.setOnClickListener {
            val intent = Intent(requireActivity(), VerificationActivity::class.java)
            startActivity(intent)
        }
        binding.btnWallet.setOnClickListener {
            val intent = Intent(requireActivity(), VerificationActivity::class.java)
            startActivity(intent)
        }
        binding.btnCancel.setOnClickListener {
            val intent = Intent(requireActivity(), VerificationActivity::class.java)
            startActivity(intent)
        }
    }

}