package com.example.myappb.tuan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myappb.R

class tuan1 : AppCompatActivity() {
    var edt1: EditText? = null
    var edt2: EditText? = null
    var bt1: Button? = null
    var tong: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan1)
        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        bt1 = findViewById(R.id.bt1)
        tong = findViewById(R.id.tong)
        bt1!!.setOnClickListener {
            tongHaiSo()
        }
    }
    private fun tongHaiSo() {
        val input1 = edt1!!.text.toString().toFloat()
        val input2 = edt2!!.text.toString().toFloat()
        val result = input1 + input2
        tong!!.text = result.toString()
    }
}