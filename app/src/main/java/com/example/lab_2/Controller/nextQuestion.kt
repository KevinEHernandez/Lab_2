package com.example.lab_2.Controller

import com.example.lab_2.Model.allQuestions

class nextQuestion {
    private val totalQuestion = allQuestions().getNumberOfQuestions()
    companion object{
        private var currentQuestion = 0
    }


    fun getNextLinearQuestion() : Int {
        currentQuestion = (currentQuestion + 1) % totalQuestion
        return currentQuestion
    }

    fun getNextRandomQuestionNumber() : Int {
        val getRand = (0..totalQuestion).random()
        return getRand
    }
}