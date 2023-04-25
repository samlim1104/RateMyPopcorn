package com.example.ratemypopcorn

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CinemaAdapter(var dataset: List<CinemaData>): RecyclerView.Adapter<CinemaAdapter.ViewHolder>()
{
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textViewName: TextView
        val textViewRating: TextView
        val layout: Constants

        init {
            textViewName = view.findViewById(R.id.textView_cinema_name)
            textViewRating = view.findViewById(R.id.textView_cinema_rating)
            layout = view.findViewById(R.id.layout_cinema)
        }
    }
}