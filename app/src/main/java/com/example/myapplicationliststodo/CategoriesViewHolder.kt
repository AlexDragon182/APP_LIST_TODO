package com.example.myapplicationliststodo

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class CategoriesViewHolder (view:View): RecyclerView.ViewHolder(view) {

    private val tvCategoryName:TextView = view.findViewById(R.id.rvCategories)
    private val divided:View = view.findViewById(R.id.divider)

    fun render(taskCategory: TaskCategory){
        tvCategoryName.text="Ejemplo"

        when(taskCategory){
            TaskCategory.Business -> {
                tvCategoryName.text = "Negocios"
                divided.setBackgroundColor(
                    ContextCompat.getColor(divided.context, R.color.business_category)
                )
            }
            TaskCategory.Other -> {
                tvCategoryName.text = "Otros"
                divided.setBackgroundColor(
                    ContextCompat.getColor(divided.context, R.color.other_category)
                )
            }
            TaskCategory.Personal -> {
                tvCategoryName.text = "Personal"
                divided.setBackgroundColor(
                    ContextCompat.getColor(divided.context, R.color.personal_category)
                )
            }
        }


    }

}