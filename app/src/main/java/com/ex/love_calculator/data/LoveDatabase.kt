package com.ex.love_calculator.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ex.love_calculator.interfaces.ShowResult

@Database(entities = [LoveModel::class], version = 1)
abstract class LoveDatabase : RoomDatabase() {
    abstract fun loveDao(): ShowResult.LoveDao
}
