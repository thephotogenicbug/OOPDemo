package com.naveen.oopdemo

import android.util.Log

class Car {
    var maxSpeed = 30
    fun start(){
        Log.i("MYTag","Car is starting...")
        Log.i("MYTag","maximum speed is $maxSpeed.")
    }
}