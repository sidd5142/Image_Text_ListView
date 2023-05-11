package com.example.listview_pro2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context : Activity, private val arrayList: ArrayList<user>) :
    ArrayAdapter<user>(context, R.layout.eachitem, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.eachitem, null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.txt1)
        val lstmasg = view.findViewById<TextView>(R.id.txt2)
        val lssttime = view.findViewById<TextView>(R.id.time)

        name.text = arrayList[position].name
        lstmasg.text = arrayList[position].lstmsg
        lssttime.text = arrayList[position].lstmsgTime
        image.setImageResource(arrayList[position].imageId)


        return view
    }
}