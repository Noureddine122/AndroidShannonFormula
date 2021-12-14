package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log2
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        idbutton.setOnClickListener {
            val w = (editTextNumberSigned.text.toString()).toDouble()
            val v = (editTextNumberSigned2.text.toString()).toDouble()
            val vv = (v.div(10)).pow(2)
            val result =w.times(1+log2(vv))
            //val result = v.div(w).pow(2.0)
            //val db = 10.times(log2(result))x
            Log.d("MainShanon","Les variable sont  la bande passante $w et votre db $v et la rapidité est $result bits/s")
            val output = result.toString() + " Mbit/s"
            textView.setText(output)
        }
    }
}




