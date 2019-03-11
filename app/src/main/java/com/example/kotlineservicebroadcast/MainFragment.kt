package com.example.kotlineservicebroadcast

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.main_fragment.*
import kotlinx.android.synthetic.main.main_fragment.view.*

class MainFragment:Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val v:View= inflater!!.inflate(R.layout.main_fragment,container,false)
        val serviceClass=MyService::class.java
        val intent= Intent(context,serviceClass)
        v.start.setOnClickListener(){
           getActivity()!!.startService(intent)
        }
        v.stop.setOnClickListener(){
           getActivity()!!.stopService(intent)
        }
        return v

    }
}