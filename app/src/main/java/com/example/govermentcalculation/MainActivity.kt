package com.example.govermentcalculation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mygstButtonvariable: Button = findViewById(R.id.gstbtn)
        val mysipButtonvariable: Button =findViewById(R.id.sipbtn)



        mygstButtonvariable.setOnClickListener {
            val intent = Intent(this, gstcalculator::class.java)
            startActivity(intent) }

        mysipButtonvariable.setOnClickListener {
            val intent = Intent(this, sipactivity::class.java)
            startActivity(intent) }


    }


}



