package com.ex.love_calculator.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "love_model")
data class LoveModel(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val firstName: String,
    val secondName: String,
    val percentage: String,
    val result: String
)
