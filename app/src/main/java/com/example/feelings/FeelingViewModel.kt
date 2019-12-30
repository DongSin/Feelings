package com.example.feelings

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class FeelingViewModel(application: Application):AndroidViewModel(application){

    private val repository: FeelingRepository
    val allFeelings: LiveData<List<MyFeeling>>

    init {
        //get reference to the DAO
        val feelingDAO = FeelingDatabase.getDatabase(application).feelingDAO()

        repository = FeelingRepository(feelingDAO)

        allFeelings = repository.allFeelings

    }

    fun insert(feeling: MyFeeling) = viewModelScope.launch{
        repository.insert(feeling)
    }
}