package com.example.findplayers

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton


class activity_ranked : LogActivity() {
    private var selectLeague=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranked)
    }
    private fun selectLeague(selected:View){
        val buttons= listOf<ToggleButton>(
                findViewById<ToggleButton>(R.id.silver),
                findViewById<ToggleButton>(R.id.nova),
                findViewById<ToggleButton>(R.id.guard),
                findViewById<ToggleButton>(R.id.starEagle),
                findViewById<ToggleButton>(R.id.Global)
        )
        buttons.forEach { if(it!=selected) {
            it.isChecked=false
        }
        else{
            selectLeague= it.text.toString()
            }
        }
    }

    fun onClickSelectLeague(view: View){
        selectLeague(view)

    }
    fun onNext(view: View){
        val intent=Intent(this, LobbiesActivity::class.java)
        if(selectLeague.isNotEmpty()){
            startActivity(intent)
        }else{
            Toast.makeText(this,
                "Please choose your rank",
                Toast.LENGTH_SHORT).show()
        } }


}