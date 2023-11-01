package com.example.dota.ui

import androidx.annotation.DrawableRes

data class CommentUi(
    val message: String,
    val user: User
)

data class User(
    @DrawableRes val avatar: Int
)