package com.chintanpatel.roomdatabaseexample

import android.content.Context
import android.os.AsyncTask
import android.util.Log
import android.widget.Toast
import com.chintanpatel.roomdatabaseexample.model.Movies

class MyClickHandlers
{
    var context: Context

    lateinit var appDatabase: AppDatabase

    constructor(context: Context)
    {
        this.context = context
    }

    fun addClicked(movie:Movies)
    {
        AsyncTask.execute {
            appDatabase = AppDatabase.getAppDatabase(context)!!
            appDatabase.daoAccess().insert(movie)
        }
    }

    fun resetClicked()
    {
        appDatabase = AppDatabase.getAppDatabase(context)!!

        var movies: List<Movies> = appDatabase.daoAccess().getAll()

        if(movies.size > 0)
        {
            for (i in 0..movies.size-1)
            {
                Log.d("Movie: ",movies[i].id.toString()+". "+movies[i].movieName+"("+movies[i].movieYear+")")
            }
        }

        //Log.d("",movie.movieName.toString()+""+movie.movieYear.toString())
    }
}