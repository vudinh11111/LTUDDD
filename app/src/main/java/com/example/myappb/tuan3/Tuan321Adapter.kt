package com.example.myappb.tuan3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myappb.R
import org.w3c.dom.Text

class Tuan321Adapter(context: Context,ls:ArrayList<Tuan312>):BaseAdapter() {
    var context:Context?=context;
    var ls:ArrayList<Tuan312>?=ls;
    override fun getCount(): Int {

        return ls!!.size
    }

    override fun getItem(position: Int): Any {

        return ls!!.get(position)
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var v:View?=convertView
        var ax:ViewAx
        if(convertView==null){
            ax=ViewAx()
            v=LayoutInflater.from(context).inflate(R.layout.tuan321_item,null)
            ax.img_hinh=v.findViewById(R.id.hinh)
            ax.ten=v.findViewById(R.id.tv1)
            ax.tuoi=v.findViewById(R.id.tv2)
            v.tag=ax
        } else{
            ax=v!!.tag as ViewAx
        }
        ax.img_hinh!!.setImageResource(ls!![position].hinh!!)
        ax.ten!!.text=ls!![position].ten
        ax.tuoi!!.text=ls!![position].tuoi
        return  v!!
    }
    inner class ViewAx{
        var img_hinh:ImageView?=null;
        var ten:TextView?=null;
        var tuoi:TextView?=null;
    }
}