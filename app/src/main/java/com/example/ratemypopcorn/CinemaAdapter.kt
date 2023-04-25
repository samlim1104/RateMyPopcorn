package com.example.ratemypopcorn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class CinemaAdapter(var dataset: List<CinemaData>): RecyclerView.Adapter<CinemaAdapter.ViewHolder>()
{
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textViewName: TextView
        val textViewRating: TextView
        val layout: ConstraintLayout

        init {
            textViewName = view.findViewById(R.id.textView_cinema_name)
            textViewRating = view.findViewById(R.id.textView_cinema_rating)
            layout = view.findViewById(R.id.layout_cinema)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.activity_cinema, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataset[position]
        var context = holder.textViewName.context
        holder.textViewName.text = data.cinema_name
        holder.textViewRating
    }
}