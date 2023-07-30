package com.example.part2.chapter2

import android.os.Handler
import android.os.Looper


class Timer(listener: OnTimerTickListener){
    private var duration = 0L
    private val handler = Handler(Looper.getMainLooper())
    private val runnable: Runnable = object: Runnable{
        override fun run() {
            duration += 100L
            handler.postDelayed(this, 100L)
            listener.onTick(duration)
        }
    }

    fun start(){
        handler.postDelayed(runnable, 100L)
    }

    fun stop(){
        handler.removeCallbacks(runnable)
    }
}

interface OnTimerTickListener {
    fun onTick(duration: Long)
}