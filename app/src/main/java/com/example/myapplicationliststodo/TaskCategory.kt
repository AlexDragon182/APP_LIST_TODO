package com.example.myapplicationliststodo

sealed class TaskCategory(var isSelected:Boolean = true) {
    object Personal : TaskCategory()
    object Business : TaskCategory()
    object  Other : TaskCategory()

    //si quieres ponerle atributo a uno tiens que convertirlo en data class

}