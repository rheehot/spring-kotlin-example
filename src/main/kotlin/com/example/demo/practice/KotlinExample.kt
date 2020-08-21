package com.example.demo.practice

/**
 * @author Geonguk Han
 * @since 2020-08-21
 */
class KotlinExample {

    fun main() {
        val names = listOf("andrew han", "teddy kim", "yello mobile")
        val byLastName = names.associate { it.split(" ").let { (firstName, lastName) -> lastName to firstName } }
        print(byLastName)
    }
}