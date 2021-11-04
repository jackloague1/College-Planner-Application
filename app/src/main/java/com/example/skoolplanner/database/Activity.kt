package com.example.skoolplanner.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * A class that represents an Activity entity.
 */
@Entity(tableName = "activity-table")
data class Activity (

    @PrimaryKey(autoGenerate = true)
    var activityId: Long = 0L,

    @ColumnInfo()
    var name: String = "",

    @ColumnInfo()
    var dueDate: String = ""
)