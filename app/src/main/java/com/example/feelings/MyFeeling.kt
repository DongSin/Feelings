package com.example.feelings

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName="Feeling")

data class MyFeeling(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val mood: Int,
    val created_at: Date,
    val remarks: String
) {

}