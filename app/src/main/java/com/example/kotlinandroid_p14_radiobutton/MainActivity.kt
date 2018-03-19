package com.example.kotlinandroid_p14_radiobutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGender)

        findViewById<Button>(R.id.btnClick).setOnClickListener {
            val id = radioGroup.checkedRadioButtonId

            val radioButton = findViewById<RadioButton>(id)

            if (id != -1){
                Toast.makeText(this, "You selected ${radioButton.text}", Toast.LENGTH_SHORT).show()
            }


        }

    }
}
