package com.example.feelings

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FeelingDAO{
    @Insert
    suspend fun insertFeeling(feeling: MyFeeling)

    @Query("select * from feeling")
    fun getFeelings() : LiveData<List<MyFeeling>>
}