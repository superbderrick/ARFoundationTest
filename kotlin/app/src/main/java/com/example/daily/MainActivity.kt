package com.example.daily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var testValue0 = "hi"
        var testValue1 = "hi1"
        var testValue3 = "hi3"

        Log.d("test" , " $(testValue0 == testValue1)"  )
    }
}