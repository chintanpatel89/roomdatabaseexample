package com.chintanpatel.roomdatabaseexample.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "movies")
data class Movies(
    @ColumnInfo(name = "movieName") var movieName: String,
    @ColumnInfo(name = "movieYear") var movieYear: String,
    @ColumnInfo(name="id") @PrimaryKey(autoGenerate = true)  var id: Long = 0)