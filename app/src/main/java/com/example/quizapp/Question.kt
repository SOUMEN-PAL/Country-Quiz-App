package com.example.quizapp

data class Question(
    val id : Int,
    val question:String,
    val image : Int,
    val op1 : String,
    val op2 : String,
    val op3 : String,
    val op4 : String,
    val correctAnswer: Int
)
