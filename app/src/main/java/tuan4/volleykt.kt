package tuan4

import android.content.Context
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley.newRequestQueue

class Volleykt {
    private var jsonDataRe="";
    fun getJsonArrayofObject(context: Context, textView: TextView){

        val queue = newRequestQueue(context);
        val url="http://192.168.221.221:3000/data";
        val request=JsonArrayRequest(url, Response.Listener {response -> for (i in 0 until  response.length()){
            val person=response.getJSONObject(i)
            val vu = person.getString("vu")
            jsonDataRe += "vu:$vu\n"

        }
            textView.text= jsonDataRe
          },Response.ErrorListener {
              error -> textView.text=error.message
        })
        queue.add(request)
    }

}