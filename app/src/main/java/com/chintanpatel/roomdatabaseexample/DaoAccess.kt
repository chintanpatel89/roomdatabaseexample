package com.chintanpatel.roomdatabaseexample

import android.arch.persistence.room.*
import com.chintanpatel.roomdatabaseexample.model.Movies

@Dao
interface DaoAccess
{
    @Query("Select * From movies")
    fun getAll(): List<Movies>

    @Insert
    fun insert(movies: Movies)

    @Update
    fun update(movies: Movies)

    @Delete
    fun delete(movies: Movies)
}