package org.ian.kotlincourse.lesson10

fun main() {
    //Задание 1: Создание Пустого Списка
    //Создайте пустой неизменяемый список целых чисел.
    val emptyList: List<Int> = emptyList()

    println("Пустой список: $emptyList")


    //Задание 2: Создание и Инициализация Списка
    //Создайте неизменяемый список строк,
    //содержащий три элемента (например, "Hello", "World", "Kotlin").
    val stringList2: List<String> = listOf("Hello", "World", "Kotlin")

    println("Список строк: $stringList2")


    //Задание 3: Создание Изменяемого Списка
    //Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val mutableList3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println("Изменяемый список: $mutableList3")


    //Задание 4: Добавление Элементов в Список
    //Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val mutableList4: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    mutableList4.add(6)
    mutableList4.add(7)
    mutableList4.add(8)

    println("Обновленный изменяемый список: $mutableList4")


    //Задание 5: Удаление Элементов из Списка
    //Имея изменяемый список строк, удалите из него определенный элемент (например, "World")
    val mutableList: MutableList<String> = mutableListOf("Hello", "World", "Kotlin", "Programming")
    mutableList.remove("World")

    println("Обновленный изменяемый список: $mutableList")


    //Задание 6: Перебор Списка в Цикле
    //Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }


    //Задание 7: Получение Элементов Списка по Индексу
    //Создайте список строк и получите из него второй элемент, используя его индекс.
    val stringList7 = listOf("Hello", "World", "Kotlin", "Programming")
    val secondElement = stringList7[1]

    println("Второй элемент списка: $secondElement")

    //Задание 8: Перезапись Элементов Списка по Индексу
    //Имея изменяемый список чисел, измените значение элемента на определенной позиции
    //(например, замените элемент на позиции 2 на новое значение).
    val mutableList8 = mutableListOf(10, 20, 30, 40, 50)
    mutableList8[2] = 57

    println("Обновленный изменяемый список: $mutableList8")


    //Задание 9: Объединение Двух Списков
    //Создайте два списка строк и объедините их в один новый список,
    //содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val list1 = listOf("Hello", "World")
    val list2 = listOf("Kotlin", "Programming")
    val combinedList = mutableListOf<String>()

    for (item in list1) {
        combinedList.add(item)
    }

    for (item in list2) {
        combinedList.add(item)
    }

    println("Объединенный список: $combinedList")


    //Задание 10: Нахождение Минимального/Максимального Элемента
    //Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val numbers10 = listOf(2, 4, 8, 1, 9, 0)
    var min = numbers10[0]
    var max = numbers10[0]

    for (number in numbers10) {
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }
    }

    println("Минимальный элемент: $min")
    println("Максимальный элемент: $max")


    //Задание 11: Фильтрация Списка
    //Имея список целых чисел, создайте новый список,
    //содержащий только четные числа из исходного списка используя цикл.
    val numbers11 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = mutableListOf<Int>()

    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }

    println("Четные числа: $evenNumbers")
}