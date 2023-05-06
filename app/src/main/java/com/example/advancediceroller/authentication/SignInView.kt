package com.example.advancediceroller.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.advancediceroller.R

class SignInView : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)

        val submitBtn = view.findViewById<Button>(R.id.submit_button)

        submitBtn.setOnClickListener {
            val action = SignInViewDirections.actionSignInFragmentToUserActionFragment()
            findNavController().navigate(action)
        }

        return view
    }

}