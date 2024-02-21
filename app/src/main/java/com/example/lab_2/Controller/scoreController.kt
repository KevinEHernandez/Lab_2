package com.example.lab_2.Controller

import com.example.lab_2.Model.Difficulty
import com.example.lab_2.Model.Score

class scoreController(val name: String) {
    private val score = Score()

    fun incrementScore(difficulty: Difficulty) {
        val changeScore = when (difficulty) {
            Difficulty.EASY -> 1.0
            Difficulty.MEDIUM -> 2.0
            else -> 3.0
        }
        score.incrementScore(changeScore)
    }

    fun getScore(): Double {
        return score.getScore()
    }
}