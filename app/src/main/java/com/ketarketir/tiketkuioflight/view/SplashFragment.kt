package com.ketarketir.tiketkuioflight.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ketarketir.tiketkuioflight.R
import com.ketarketir.tiketkuioflight.databinding.FragmentSplashBinding
import com.ketarketir.tiketkuioflight.viewmodel.SplashViewModel

class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onStart() {
        super.onStart()
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
        }, 3000)


    }
}