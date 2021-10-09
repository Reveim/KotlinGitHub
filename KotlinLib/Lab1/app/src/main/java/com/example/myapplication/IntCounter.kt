package com.example.myapplication

import kotlin.random.Random

class IntCounter {
    var number: Int = 0
    var numbers: List<Int> = listOf()
    var med: Int = 0

    init {
        updateNumbers()
    }

    fun updateNumbers(){
        numbers = List(10){ Random.nextInt(0, 20) }
    }

    fun IntCountOut():Int{
        med = numbers.average().toInt()
        number = numbers.filter{ value -> (value < med - 5) or
                (value > med + 5) }.size
        return number
    }
}


