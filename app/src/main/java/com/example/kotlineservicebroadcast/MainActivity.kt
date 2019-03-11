package com.example.kotlineservicebroadcast

import android.annotation.SuppressLint
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.LocalBroadcastManager

class MainActivity : AppCompatActivity() {

    @SuppressLint("ByteOrderMark")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val receiver: MyReceiver = MyReceiver()
         LocalBroadcastManager.getInstance(this)
            .registerReceiver(MyReceiver(), IntentFilter("music_play"))


    }
}
