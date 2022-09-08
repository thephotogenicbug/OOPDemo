package com.naveen.oopdemo

import android.util.Log

class Driver(var name : String, credit : Int) {
   private val car = Car()
   private var totalCredit = 50


    init {
        totalCredit += credit
        car.maxSpeed = 150
        car.start()

    }

    fun showDetails(){
        Log.i("MYTag", "name of the driver is $name with $totalCredit credits")
    }

    // Function
    // A Function is a piece of code tht is called by name it can be passed data to operate on
    // and optionally to return data

    // Method
    // A Method is a piece of code that is called by name that is a associated with an
     // Object  in most cases we can consider an method is also a function
}