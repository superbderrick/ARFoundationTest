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

        var intValues = arrayOf(1,2,3,4)

        Log.d("Main","TestValue : " + max(numbers = intValues) )

        val onToFive:IntRange = 1..5
        val aToE:CharRange = 'a'..'e'

        val seekHelp: ClosedRange<String> = "hell".."help"
        Log.d("test" , "${seekHelp.contains("hell")}")
        Log.d("test" , "${seekHelp.contains("help")}")

        for(i in 1..5) {
            Log.d("test" , "$i")
        }

        for(ab in 'a'..'e') {
            Log.d("test" , "$ab")
        }

        for(downTest in 5.downTo(1)) {
            Log.d("test" , "$downTest")
        }
        for(stepTestI in 1 until 10 step 3) {

        }
        //3의 배수 or 5의 배수 


    }

    fun max(numbers: Array<Int>) : Int {
        var large = Int.MAX_VALUE

        for(number in numbers) {
            large = if(number > large) number else large
        }
        return large
    }
}
