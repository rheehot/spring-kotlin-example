package com.example.demo.practice

import com.sun.tools.internal.xjc.model.CArrayInfo

/**
 * @author Geonguk Han
 * @since 2020-08-21
 */
class Car(val horsepowers: Int) {
    companion object Factory {
        val cars = mutableListOf<Car>()

        fun makeCar(horsepowers: Int): Car{
            val car = Car(horsepowers)
            cars.add(car)
            return car

        }
    }
}

