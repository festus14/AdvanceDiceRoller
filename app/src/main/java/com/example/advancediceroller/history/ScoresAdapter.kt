package com.example.advancediceroller.history

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.advancediceroller.R
import com.example.advancediceroller.data.GameScore

class ScoresAdapter(private val data: List<GameScore>) :
    RecyclerView.Adapter<ScoresAdapter.ScoresViewHolder>() {

    class ScoresViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val scoreValue: TextView = view.findViewById(R.id.score_value)
        val scoreDescription: TextView = view.findViewById(R.id.score_description)

        init {
            // Define click listener for the ViewHolder's View
            scoreValue.text = "heloooo!!!!"
            scoreDescription.text = "Screeammmmm!!!!"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScoresViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.score_list_item, parent, false)
        return  ScoresViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ScoresViewHolder, position: Int) {
        holder.scoreValue.text = data[position].score.toString()
        holder.scoreDescription.text = data[position].description
    }
}