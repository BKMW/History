package com.bel.history

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*find the id of the ListView*/
        //val listView = findViewById<ListView>(R.id.list_view) as ListView

        /*Set an adapter for the list view having the string array*/
        //list_view.adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, resources.getStringArray(R.array.android_versions))
        listView.adapter = ArrayAdapter(this, R.layout.card_view, R.id.textView, resources.getStringArray(R.array.android_versions))


        /*set click listener for listView*/
        listView.setOnItemClickListener { parent:AdapterView<*>?, view:View?, position:Int, id:Long ->

            val intent= Intent(this,HtmlWebView::class.java)
            intent.putExtra("page",position)
            intent.putExtra("subTitle",parent!!.getItemAtPosition(position).toString())
            startActivity(intent)

            //Toast.makeText(this@MainActivity, "You have Clicked " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show()
        }
    }
}
