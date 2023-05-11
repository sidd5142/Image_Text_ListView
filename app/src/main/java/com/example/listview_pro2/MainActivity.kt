package com.example.listview_pro2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList : ArrayList<user>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Saumya", "Harshita", "Deepak", "Sidd", "Nik")

        val lastmsg = arrayOf("Hey wassup", "Im fine", "Exceleent", "Osm", "Cool")

        val lstmsgTime = arrayOf("6.25am", "5.21pm", "6.00am", "9.52pm", "12.00am")

        val phoneNumber = arrayOf("9450306932", "9554657101", "9569673877", "9140161120", "9305619472")

        val imgId = intArrayOf(R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4,
            R.drawable.img_5)

        userArrayList  = ArrayList()

        for (eachIndex in name.indices){

            val User = user(name[eachIndex], lastmsg[eachIndex], lstmsgTime[eachIndex],
            phoneNumber[eachIndex], imgId[eachIndex])

            userArrayList.add(User)
        }

        val listview = findViewById<ListView>(R.id.listView)
        listview.isClickable = true
        listview.adapter = MyAdapter(this,userArrayList)

    }

}