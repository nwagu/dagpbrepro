package com.example.dagpbrepro

import com.example.librarya.Sedan

class CarGame {

    val sedan = Sedan(wheels = 4)

    fun run() {
        println(sedan.wheels)
    }
}