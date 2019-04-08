package com.chintanpatel.roomdatabaseexample

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.chintanpatel.roomdatabaseexample.model.Movies
import android.arch.persistence.room.Room
import android.content.Context


@Database(entities = arrayOf(Movies::class), version = 1)
abstract class AppDatabase: RoomDatabase()
{
    abstract fun daoAccess():DaoAccess

    companion object {
        var INSTANCE: AppDatabase? = null
        fun getAppDatabase(context: Context): AppDatabase?
        {
            if (INSTANCE == null)
            {
                INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "MyMoviesDb.db")
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}