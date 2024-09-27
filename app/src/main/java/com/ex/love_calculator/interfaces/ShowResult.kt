package com.ex.love_calculator.interfaces

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ex.love_calculator.models.LoveModel

interface ShowResult {
  fun  showResult( fname:String,sname:String, percent:String,result:String)

  @Dao
  interface LoveDao {
    @Insert
    suspend fun insertLoveModel(loveModel: LoveModel)

    @Query("DELETE FROM love_model WHERE id = :id")
    suspend fun deleteLoveModel(id: Int)
  }
}