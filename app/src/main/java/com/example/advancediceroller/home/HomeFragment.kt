package com.example.advancediceroller.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.advancediceroller.R

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         val view = inflater.inflate(R.layout.fragment_home, container, false)

        val signUpBtn = view.findViewById<Button>(R.id.sign_up_button)
        val signInBtn = view.findViewById<Button>(R.id.sign_in_button)

        signUpBtn.setOnClickListener{
            val action =
            HomeFragmentDirections.actionHomeFragmentToSignUpFragment()
            findNavController().navigate(action)
        }

        signInBtn.setOnClickListener{
            val action =
            HomeFragmentDirections.actionHomeFragmentToSignInFragment()
            findNavController().navigate(action)
        }

        return view
    }
}