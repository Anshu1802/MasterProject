package com.example.govermentcalculation

import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class sipactivity : AppCompatActivity() {

    private var progressView: TextView? = null
    private var seekbarView: SeekBar? = null
    var seekBarNormal: SeekBar? = null

    private var progressView2: TextView? = null
    private var seekbarView2: SeekBar? = null
    var seekBarNormal2: SeekBar? = null

    private var progressView3: TextView? = null
    private var seekbarView3: SeekBar? = null
    var seekBarNormal3: SeekBar? = null
    lateinit var variable :String




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



        seekBarNormal?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, progress: Int,
                                           fromUser: Boolean) {
                progressView!!.text = progress.toString()
//                variable=progress.toString()

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

            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }
        })





    }


}
