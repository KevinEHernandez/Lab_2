package com.example.lab_2.Model

class Score {
    companion object {
        private var score = 0.0
        private var totalQuestions = 0
    }

    fun incrementTotalQuestions() {
        totalQuestions++
    }

    fun incrementScore(scoreChange: Double){
        incrementTotalQuestions()
        score += scoreChange
    }

    fun getScore(): Double{
        return score
    }

}