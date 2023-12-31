package com.example.myappb.tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myappb.R

class tuan22 : AppCompatActivity() {
    var list:ListView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22)
        list=findViewById(R.id.listview2)
        var array = arrayOf("vu","hello","hi","gia binh","bac ninh","Hello World")
        var add=ArrayAdapter(this,android.R.layout.simple_list_item_1,array)
        list!!.adapter=add
    }
}