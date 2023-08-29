package com.demo.example

import android.util.Log

object ExampleLog {

    fun logger(tag: String, msg: String) {
        Log.e(tag, msg)
    }
}