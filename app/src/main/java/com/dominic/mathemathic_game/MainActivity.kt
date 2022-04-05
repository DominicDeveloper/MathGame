package com.dominic.mathemathic_game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn_go:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_go = findViewById(R.id.go_window_1)

        btn_go.setOnClickListener{

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }


    }
}