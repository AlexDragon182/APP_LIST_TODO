package com.example.myapplicationliststodo

data class Task(val name:String , val category: TaskCategory,var isSelected:Boolean = false) {


}