package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class myAdapter(var mycntx:Context,var resources:Int, var items:List<models>): ArrayAdapter<models>(mycntx,resources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mycntx)
        val view: View= layoutInflater.inflate(resources,null)
        val imageView:  ImageView=view.findViewById(R.id.image)
        val TV_title:TextView=view.findViewById(R.id.Tv_maintext)
        val Tv_description:TextView=view.findViewById(R.id.Tv_subtext)

        val myitems:models=items[position]
        imageView.setImageDrawable(mycntx.resources.getDrawable(myitems.img))
        TV_title.text=myitems.title
        Tv_description.text=myitems.description

        return view
    }
}