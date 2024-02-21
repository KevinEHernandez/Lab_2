package com.example.lab_2.Model

class allQuestions {
    private val allQuestions = arrayListOf<Question<Boolean>>(
        Question<Boolean>("This is true", true, Difficulty.EASY),
        Question<Boolean>("This is true", true, Difficulty.EASY),
        Question<Boolean>("This is false", false, Difficulty.HARD)
    )

    fun getNumberOfQuestions() : Int {
        return allQuestions.size
    }

    fun getQuestion(i: Int) : Question<Boolean>{
        return allQuestions[i]
    }
}