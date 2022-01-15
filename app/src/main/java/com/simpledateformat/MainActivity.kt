package com.simpledateformat

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.simpledateformat.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initializeData()
    }

    private fun initializeData() {

        val date : Date = Calendar.getInstance().time

        //Current milliseconds
        Log.i(TAG, "initializeData: "+Calendar.getInstance().timeInMillis)
        Log.i(TAG, "initializeData: "+date.time)

        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
        val time = simpleDateFormat.format(date)
        Log.i(TAG,time)
    }
}