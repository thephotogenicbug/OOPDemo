package com.naveen.oopdemo

interface SpeedController {
    fun accelerate()
    fun declerate()

    fun getBrandId():String{
        return "ADS3452"
    }
}