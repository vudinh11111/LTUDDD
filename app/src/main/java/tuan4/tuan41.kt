package tuan4


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myappb.R
class Tuan41 : AppCompatActivity() {
    private var but:Button?=null;
    private var textv:TextView?=null;
    var context : Context =this;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan41)
        but=findViewById(R.id.button2)
        textv =findViewById(R.id.textView12)
        val fn = Volleykt()
        but!!.setOnClickListener { fn.getJsonArrayofObject(context,textv!!) }
        

    }
}