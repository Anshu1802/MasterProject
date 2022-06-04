package com.example.govermentcalculation

import android.R.attr.stepSize
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class sipactivity : AppCompatActivity() {

    private var progressView: TextView? = null
    var seekBarNormal: SeekBar? = null

    private var progressView2: TextView? = null
    var seekBarNormal2: SeekBar? = null

    private var progressView3: TextView? = null
    var seekBarNormal3: SeekBar? = null






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sipactivity)

//   for seekbar 1 for corner text
        progressView = this.findViewById(R.id.seekbaramounttext)
        seekBarNormal = this.findViewById(R.id.seekbar_Default)

        progressView2 = this.findViewById(R.id.seekbaryeartext)
        seekBarNormal2 = this.findViewById(R.id.seekbar_Discrete)

        progressView3 = this.findViewById(R.id.seekbarreturntext)
        seekBarNormal3 = this.findViewById(R.id.seekbar_return)


        var convert :String
        var convertint :Int=0

        var convert2 :String
        var convertint2 :Int=0

        var convert3 :String
        var convertint3 :Int=0



        seekBarNormal?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {

                progressView!!.text = (Math.round((progress / 500).toDouble()).toInt() * 500).toString()
                convert=progress.toString()
                convertint=convert.toInt()


            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }
        })



        seekBarNormal2?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, progress: Int,
                                           fromUser: Boolean) {
                progressView2!!.text = progress.toString()
                convert2=progress.toString()
                convertint2=convert2.toInt()

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }
        })

        seekBarNormal3?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, progress: Int,
                                           fromUser: Boolean) {
                progressView3!!.text = progress.toString()
                convert3=progress.toString()
                convertint3=convert3.toInt()

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }
        })











        var sipbutton :Button=findViewById(R.id.buttonsip)
        var resulttext:TextView=findViewById(R.id.resultsip)
        var totalamount=(convertint*12)*convertint2



        sipbutton.setOnClickListener {

            resulttext.setText("the amount after calculating $totalamount")


        }


















    }




}
