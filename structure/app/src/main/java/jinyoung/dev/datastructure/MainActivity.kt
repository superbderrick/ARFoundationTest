package jinyoung.dev.datastructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stack = Stack(1,2,3,4)
        Log.d("valueTest" ,"Value : $stack")
    }
}