package com.example.useinstagramapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.useinstagramapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //DataBindingUtil class의 객체를 생성
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //기존의 setContentView()를 DataBindingUtil.setContentView()로 대체한다.
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
    }
}