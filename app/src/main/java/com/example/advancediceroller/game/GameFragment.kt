package com.example.advancediceroller.game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.advancediceroller.R
import java.util.Random

class GameFragment : Fragment() {
    private lateinit var diceImage: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_game, container, false)
        val rollBtn: Button = view.findViewById(R.id.roll_button)
         diceImage = view.findViewById(R.id.dice_image)

        rollBtn.setOnClickListener {
            rollDice()
        }

        return view
    }

    private fun rollDice() {
        val drawableResource = when (Random().nextInt(6) + 1) {
            1 -> {
                showScoreToast(1)
                R.drawable.dice_1
            }
            2 -> {
                showScoreToast(2)
                R.drawable.dice_2
            }
            3 -> {
                showScoreToast(3)
                R.drawable.dice_3
            }
            4 -> {
                showScoreToast(4)
                R.drawable.dice_4
            }
            5 -> {
                showScoreToast(5)
                R.drawable.dice_5
            }
            else -> {
                showScoreToast(6)
                R.drawable.dice_6
            }
        }

        diceImage.setImageResource(drawableResource)
    }

    private fun showScoreToast(diceValue: Int) {
        when (diceValue) {
            in 1..2 -> Toast.makeText(context, "Poor!", Toast.LENGTH_SHORT).show()
            in 3..4 -> Toast.makeText(context, "Fair!", Toast.LENGTH_SHORT).show()
            in 5..6 -> Toast.makeText(context, "Excellent!", Toast.LENGTH_SHORT).show()
            else -> Toast.makeText(context, "Score out of range!", Toast.LENGTH_SHORT).show()
        }
    }

}