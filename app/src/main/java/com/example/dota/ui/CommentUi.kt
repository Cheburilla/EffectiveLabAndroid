package com.example.dota.ui

import androidx.annotation.DrawableRes

data class CommentUi(
    val message: String, val user: User, val date: String
)

data class User(
    @DrawableRes val avatar: Int, val name: String
)