package com.example.myapplicationliststodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivityToDo : AppCompatActivity() {

    private lateinit var rvCategories : RecyclerView
    private lateinit var categoriesAdapter:CategoriesAdapter
    private val categories = listOf(
        TaskCategory.Other,
        TaskCategory.Business,
        TaskCategory.Personal
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_to_do)
    }
    private fun initUI(){
        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rvCategories.adapter = categoriesAdapter
    }
    private fun initComponent (){
        rvCategories = findViewById(R.id.rvCategories)
    }
}