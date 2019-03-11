package com.example.kotlineservicebroadcast

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : Service() {

    private lateinit var mp: MediaPlayer

    override fun onBind(intent: Intent?): IBinder? {
        throw UnsupportedOperationException("Not yet implemented") as Throwable
    }
    override fun onCreate(){
        mp= MediaPlayer.create(this,R.raw.mp)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mp.start()
        val intent=Intent("music_play")
        sendBroadcast(intent)
        return START_STICKY
    }

    override fun onDestroy() {
        mp.stop()
    }
}
