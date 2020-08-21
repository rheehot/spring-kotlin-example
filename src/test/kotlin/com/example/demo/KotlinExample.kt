package com.example.demo

/**
 * @author Geonguk Han
 * @since 2020-08-21
 */

fun main() {
    val names = listOf("andrew han", "teddy kim", "yello mobile")
    val byLastName = names.associate { it.split(" ").let { (firstName, lastName) -> lastName to firstName } }
    print(byLastName)
}