package com.example.advancediceroller.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.advancediceroller.R
import com.example.advancediceroller.data.GameScore

val gameScoreMock = listOf(GameScore("01", 5, "excellent"), GameScore("02", 1, "poor"))

class HistoryView() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_history, container, false)

        val scoresAdapter = ScoresAdapter(gameScoreMock)
        val scoresRecyclerView: RecyclerView = view.findViewById(R.id.scores_recycler_view)

        scoresRecyclerView.adapter = scoresAdapter

        return view
    }
}