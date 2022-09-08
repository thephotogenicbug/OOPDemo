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
}