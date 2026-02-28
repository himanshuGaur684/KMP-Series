package dev.himanshu.myapplication

import android.util.Log

class AndroidLogger : Logger{
    override fun log(message: String) {
        Log.d("TAGGGGGGGG", "log: $message")
    }
}