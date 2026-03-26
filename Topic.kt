package com.example.task3.model

import androidx.annotation.StringRes

data class Topic(
    val day: Int,
    @StringRes val titleRes: Int,
    val imageUrl: String,
    @StringRes val descriptionRes: Int
)
