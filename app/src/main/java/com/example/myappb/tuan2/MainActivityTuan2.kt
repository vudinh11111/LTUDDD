package com.example.myappb.tuan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myappb.R

class MainActivityTuan2 : AppCompatActivity() {
    var ad1:EditText?=null
    var ad2:EditText?=null
    var button:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tuan2)
       ad1=findViewById(R.id.ed1)
        ad2=findViewById(R.id.ed2)
        button=findViewById(R.id.button)
        button!!.setOnClickListener({
            val i = Intent(this,MainActivity::class.java)
            i.putExtra("ad1",ad1!!.text!!.toString())
            i.putExtra("ad2",ad2!!.text.toString())
            startActivity(i)

        })

    }



}