package com.example.myappb.tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myappb.R

class tuan21 : AppCompatActivity() {
    var textVieww:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan21)
        textVieww=findViewById(R.id.textView2)
        var i1=getIntent()
        val chuoi1=i1!!.extras!!.getString("ad1")!!.toFloat()
        var chuoi2=(i1!!.extras!!.getString("ad2"))!!.toFloat()
        textVieww!!.text=(chuoi1+chuoi2).toString()
    }

}