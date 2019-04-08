package com.chintanpatel.roomdatabaseexample

import android.content.Context
import android.databinding.DataBindingUtil
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.chintanpatel.roomdatabaseexample.databinding.ActivityMainBinding
import com.chintanpatel.roomdatabaseexample.model.Movies
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.coroutines.coroutineContext

class MainActivity : AppCompatActivity()
{
    lateinit var mainBinding: ActivityMainBinding

    var movie: Movies = Movies(movieName = "", movieYear = "")

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        mainBinding =DataBindingUtil.setContentView(this,R.layout.activity_main)

        mainBinding.movieModel = movie

        var clickHandler = MyClickHandlers(this)
        mainBinding.clickHandler = clickHandler
    }
}
