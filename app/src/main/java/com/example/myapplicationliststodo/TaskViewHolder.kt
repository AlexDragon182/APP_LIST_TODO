package com.example.myapplicationliststodo

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder (view: View): RecyclerView.ViewHolder(view) {

    private val tvCategoryName: TextView = view.findViewById(R.id.rvCategories)
    private val divided: View = view.findViewById(R.id.divider)

    fun render(task: Task) {

    }
}