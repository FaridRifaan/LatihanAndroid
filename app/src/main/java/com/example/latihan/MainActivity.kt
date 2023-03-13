package com.example.latihan

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    val camelCase1 = 26

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
    }
//    fun camelCase(){
//        println(Companion.USER_ID)
//        println(camelCase1)
//    }
//
//    companion object {
//        const val USER_ID = 2
//    }


}