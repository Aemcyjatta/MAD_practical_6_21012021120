package com.example.mad_practical_6_21012021120

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//    val playpause = findViewById<View>(R.id.playpause)
//    playpause_button.setOnClickListener {
//        Intent = Intent(this,playpause())
//        startActivity(intent)
//    }
//    var stop = findViewById<View>(R.id.stop)
//    playpause_button.setOnClickListener {
//        intent = Intent(this, stop())
//        startActivity(intent)
//    }
    fun playpause(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { startService(this) }

    }
    fun stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply { startService(this) }

    }

}