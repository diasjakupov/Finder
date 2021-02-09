package com.example.findplayers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val main_btn=findViewById<View>(R.id.main_btn)
        main_btn.setOnClickListener {
            val intent= Intent(this, activity_ranked::class.java)
            startActivity(intent)
        }
    }
}