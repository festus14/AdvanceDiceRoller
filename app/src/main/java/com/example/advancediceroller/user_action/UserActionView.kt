package com.example.advancediceroller.user_action

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.advancediceroller.R

class UserActionView : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_user_action, container, false)
        val gameBtn = view.findViewById<Button>(R.id.game_button)
        val historyBtn = view.findViewById<Button>(R.id.history_button)

        gameBtn.setOnClickListener {
            val action = UserActionViewDirections.actionUserActionFragmentToGameFragment()
            findNavController().navigate(action)
        }

        historyBtn.setOnClickListener {
            val action = UserActionViewDirections.actionUserActionFragmentToHistoryFragment()
            findNavController().navigate(action)
        }

        return view
    }
}