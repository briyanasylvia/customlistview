package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview= findViewById<ListView>(R.id.listview)
        var list = mutableListOf<models>()

        //adding images

        list.add(models("PIZZA","This is an image of pizza",R.drawable.pizza1))
        list.add(models("IPHONE","This is an image of an iphone 14 promax",R.drawable.iphone))
        list.add(models("STUDENTS","This is an image of students in tech talk",R.drawable.king2))
        list.add(models("MAN","This is an image of a man",R.drawable.kings))
        list.add(models("CCTV","This is an image of a cctv",R.drawable.kings3))


        listview.adapter =  myAdapter(this,R.layout.row,list)

    }
}