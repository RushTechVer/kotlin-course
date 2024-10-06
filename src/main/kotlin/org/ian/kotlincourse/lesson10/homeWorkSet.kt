package org.ian.kotlincourse.lesson10

fun main() {
    //Задание 1: Создание Пустого Множества
    //Создайте пустое неизменяемое множество целых чисел.
    val emptySet: Set<Int> = emptySet()

    println("Пустое множество: $emptySet")


    //Задание 2: Создание и Инициализация Списка
    //Создайте неизменяемый список строк, содержащий три элемента
    //(например, "Hello", "World", "Kotlin").
    val immutableSet: Set<Int> = setOf(1, 2, 3)

    println("Неизменяемое множество: $immutableSet")


    //Задание 3: Создание Изменяемого Множества
    //Создайте изменяемое множество строк и инициализируйте его несколькими значениями
    //(например, "Kotlin", "Java", "Scala").
    val languages3 = mutableSetOf("Kotlin", "Java", "Scala")

    println("Изменяемое множество языков программирования: $languages3")


    //Задание 4: Добавление Элементов в Множество
    //Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go")
    val languages4 = mutableSetOf("Kotlin", "Java", "Scala")

    println("Исходное множество языков программирования: $languages4")

    languages4.add("Swift")
    languages4.add("Go")

    println("Обновленное множество языков программирования: $languages4")


    //Задание 5: Удаление Элементов из Множества
    //Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val numbers = mutableSetOf(1, 2, 3, 4, 5)

    println("Исходное множество чисел: $numbers")

    numbers.remove(2)

    println("Обновленное множество чисел: $numbers")


    //Задание 6: Перебор Множества в Цикле
    //Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val numbers6 = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (number in numbers6) {
        println(number)
    }


    //Задание 7: Проверка Наличия Элемента в Множестве
    //Создай функцию, которая принимает множество строк (set) и строку и проверяет,
    //есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть.
    val stringSet = setOf("апельсин", "банан", "лимон", "виноград")
    val elementToCheck = "банан"
    val result = containsElement(stringSet, elementToCheck)


    //Задание 8: Объединение Двух Множеств
    //Создайте два множества строк и объедините их в одно новое множество,
    //содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.
    val set1 = setOf("яблоко", "банан", "апельсин")
    val set2 = setOf("банан", "виноград", "киви")
    val unionSet = mutableSetOf<String>()

    for (item in set1) {
        unionSet.add(item)
    }
    for (item in set2) {
        unionSet.add(item)
    }
    println("Объединенное множество: $unionSet")


    //Задание 9: Нахождение Пересечения Множеств
    //Создайте два множества целых чисел и найдите их пересечение (общие элементы).
    //Реши задачу через вложенные циклы
    val set19 = setOf(1, 2, 3, 4, 5)
    val set29 = setOf(4, 5, 6, 7, 8)
    val intersectionSet = mutableSetOf<Int>()
    for (num1 in set19) {
        for (num2 in set29) {
            if (num1 == num2) {
                intersectionSet.add(num1)
            }
        }
    }

    //Задание 10: Нахождение Разности Множеств
    //Создайте два множества строк и найдите разность первого множества относительно второго
    //(элементы, присутствующие в первом множестве, но отсутствующие во втором).
    //Реши задачу через вложенные циклы и переменные флаги
    val set10 = setOf("яблоко", "банан", "апельсин", "виноград")
    val set20 = setOf("банан", "киви", "виноград")
    val differenceSet = mutableSetOf<String>()
    for (item1 in set1) {
        var found = false // Флаг для отслеживания наличия элемента во втором множестве

        for (item2 in set2) {
            if (item1 == item2) {
                found = true // Элемент найден во втором множестве
                break // Выходим из внутреннего цикла
            }
            if (!found) {
            }
            differenceSet.add(item1)
        }
    }
    println("Разность множеств: $differenceSet")


    //Задание 11: Конвертация Множества в Список
    //Создайте множество строк и конвертируйте его в список с использованием цикла.
    val stringSet11 = setOf("банан", "яблоко", "апельсин", "виноград")
    val stringList = mutableListOf<String>()
    for (item in stringSet) {
        stringList.add(item) // Добавляем элемент в список
    }
    println("Список, полученный из множества: $stringList")
}

//Задание 7
fun containsElement(set: Set<String>, element: String): Boolean {
    // Перебираем все элементы множества
    for (item in set) {
        // Если найдено совпадение, возвращаем true
        if (item == element) {
            return true
        }
    }
    // Если совпадение не найдено, возвращаем false
    return false
}

