package com.example.govermentcalculation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class gstcalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gstcalculator)

        val mygstButton: Button = findViewById(R.id.calculategstbtn)


        mygstButton.setOnClickListener {

            calculate()

        }


    }

    private fun calculate() {
        val answerview: TextView = findViewById(R.id.answer)
        val amountfield: EditText =findViewById(R.id.amoutinputfield)
        val gstfield:EditText=findViewById(R.id.gstinputfield)


        var amount: String = amountfield.getText().toString()
        var gstpercentage: String = gstfield.getText().toString()
        var amounttoint = amount.toInt()
        var gsttoint = gstpercentage.toInt()
        var govermentgsttax=(amounttoint*gsttoint)/100
        answerview.setText("Calculated G.S.T amount $govermentgsttax")
    }
}