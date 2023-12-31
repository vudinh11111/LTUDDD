package com.example.myappb.tuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myappb.R

class tuan3 : AppCompatActivity() {
    var adap:Tuan321Adapter?=null
    var ls:ArrayList<Tuan312>?=ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan3)
        var lv=findViewById<ListView>(R.id.lsv)
        ls!!.add(Tuan312(
            ten = "vu", tuoi = "19",  R.drawable.vv
        ))
        ls!!.add(Tuan312(
            ten = "dinh viet vu", tuoi = "20",  R.drawable.ap
        ))
        ls!!.add(Tuan312(
            ten = "dinh viet vu", tuoi = "21",  R.drawable.vv
        ))

        adap=Tuan321Adapter(this, ls!!)
        lv.adapter=adap

    }
}