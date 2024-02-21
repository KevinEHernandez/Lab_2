package com.example.lab_2.Controller

import com.example.lab_2.Model.UserID

class userController(private val userID: UserID) {

    fun getName(): String? {
        return userID.getName()
    }

    fun setName(newName: String?) {
        userID.setName(newName)
    }
}