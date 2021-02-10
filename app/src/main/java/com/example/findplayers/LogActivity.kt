package com.example.findplayers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class LogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("LifeCycle", "${javaClass.simpleName} onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d("LifeCycle", "${javaClass.simpleName} onStart")
        super.onStart()
    }

    override fun onRestart() {
        Log.d("LifeCycle", "${javaClass.simpleName} onRestart")
        super.onRestart()
    }

    override fun onResume() {
        Log.d("LifeCycle", "${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("LifeCycle", "${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("LifeCycle", "${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("LifeCycle", "${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }
}