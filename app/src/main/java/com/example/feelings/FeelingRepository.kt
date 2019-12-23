package com.example.feelings

import androidx.lifecycle.LiveData

class FeelingRepository(private val feelingDAO: FeelingDAO) {

    val allFeelings: LiveData<MyFeeling> = feelingDAO.getFeelings()

    suspend fun insert(myFeeling: MyFeeling){
        feelingDAO.insertFeeling(myFeeling)
    }
}