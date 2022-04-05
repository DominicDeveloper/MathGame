package com.dominic.mathemathic_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {

    lateinit var radio:RadioButton
    lateinit var radio_2:RadioButton
    lateinit var radio_3:RadioButton
    lateinit var radio_group:RadioGroup
    lateinit var stage_1:TextView
    lateinit var task:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        radio = findViewById(R.id.radio_1)
        radio_2 = findViewById(R.id.radio_2)
        radio_3 = findViewById(R.id.radio_3)
        radio_group = findViewById(R.id.radio_group)
        stage_1 = findViewById(R.id.stage_1)
        task = findViewById(R.id.task)

        task.text = "349 + 951"

        radio.text = " 1300"
        radio_2.text = "1200"
        radio_3.text = "1240"



            radio.setOnCheckedChangeListener { buttonView, isChecked ->

                Toast.makeText(this, "Notog'ri javob", Toast.LENGTH_SHORT).show()
            }


            radio_2.setOnCheckedChangeListener { buttonView, isChecked ->


                radio
                Toast.makeText(this, "To'gri javob", Toast.LENGTH_SHORT).show()
            }

            radio_3.setOnCheckedChangeListener { buttonView, isChecked ->

                Toast.makeText(this, "Notog`ri javob", Toast.LENGTH_SHORT).show()


        }




    }
}