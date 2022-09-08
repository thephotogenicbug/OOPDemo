package com.naveen.oopdemo

import android.util.Log

// MyCar is a Child class of Car class (Inheritance)
class MyCar : Car(),SpeedController{
    override fun start(){
        Log.i("MYTag", "this is MyCar Starting.....Brand id is ${getBrandId()}")
    }

    override fun accelerate() {

    }

    override fun declerate() {

    }
}