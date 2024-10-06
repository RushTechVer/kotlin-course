package org.ian.kotlincourse.lesson9

fun main() {
    val name = "Александр"
    println("Введите ваш возраст:")

    val ageInput = readLine()
    val age = ageInput

    val greeting = when {
        else -> "С днём рождения, $name! https://www.youtube.com/watch?v=MTlWoUzSgKs!"
    }
    println(greeting)
}