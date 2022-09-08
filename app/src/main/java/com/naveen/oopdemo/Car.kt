package com.naveen.oopdemo

import android.util.Log

open class Car {
    var maxSpeed = 30
   open fun start(){
        Log.i("MYTag","Car is starting...")
        Log.i("MYTag","maximum speed is $maxSpeed.")
    }
}