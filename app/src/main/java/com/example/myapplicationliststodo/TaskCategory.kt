package com.example.myapplicationliststodo

sealed class TaskCategory {
    object Personal : TaskCategory()
    object Business : TaskCategory()
    object  Other : TaskCategory()

}