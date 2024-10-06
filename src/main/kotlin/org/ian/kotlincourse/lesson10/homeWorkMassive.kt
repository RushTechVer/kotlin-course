package org.ian.kotlincourse.lesson10

fun main() {
    //Задание 1: Создание и Инициализация Массива
    //Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val numbers1 = arrayOf(1, 2, 3, 4, 5)

    println(numbers1.joinToString(", "))


    //Задание 2: Создание Пустого Массива
    //Создайте пустой массив строк размером 10 элементов
    val emptyArray = Array<String>(10) { "" }

    println("Размер массива: ${emptyArray.size}")


    //Задание 3: Заполнение Массива в Цикле
    //Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val doubleArray = DoubleArray(5)
    for (i in doubleArray.indices) {
        doubleArray[i] = i * 2.0
    }
        println(doubleArray.joinToString(", "))


    //Задание 4: Изменение Элементов Массива
    //Создайте массив из 5 элементов типа Int. Используйте цикл,
    // чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val intArray = IntArray(5)
    for (i in intArray.indices) {
        intArray[i] = i * 3
    }
    println(intArray.joinToString(", "))


    //Задание 5: Работа с Nullable Элементами
    //Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val stringArray: Array<String?> = arrayOf(null, "Первая строка", "Вторая строка")

    println(stringArray.joinToString(", "))


    //Задание 6: Копирование Массива
    //Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val originalArray = intArrayOf(1, 2, 3, 4, 5)
    val newArray = IntArray(originalArray.size)
    originalArray.copyInto(newArray)

    println("Исходный массив: ${originalArray.joinToString(", ")}")
    println("Скопированный массив: ${newArray.joinToString(", ")}")


    //Задание 7: Разница Двух Массивов
    //Создайте два массива целых чисел одинаковой длины.
    // Создайте третий массив, вычев значения одного из другого
    val array1 = intArrayOf(10, 20, 30, 40, 50)
    val array2 = intArrayOf(1, 2, 3, 4, 5)
    val differenceArray = IntArray(array1.size) { array1[it] - array2[it] }

    println("Первый массив: ${array1.joinToString(", ")}")
    println("Второй массив: ${array2.joinToString(", ")}")
    println("Разность массивов: ${differenceArray.joinToString(", ")}")


    //Задание 8: Поиск Индекса Элемента
    //Создайте массив целых чисел. Найдите индекс элемента со значением 5.
    //Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
    val numbers = intArrayOf(1, 3, 5, 7, 9) // Создаем массив целых чисел
    val target = 5 // Значение, которое мы ищем
    var index = 0 // Начальный индекс
    var foundIndex = -1 // Переменная для хранения результата

    while (index < numbers.size) {
        if (numbers[index] == target) {
            foundIndex = index
            break
        }
        index++
    }
    println("Индекс элемента со значением $target: $foundIndex")


    //Задание 9: Перебор Массива
    //Создайте массив целых чисел. Используйте цикл для перебора массива
    //и вывода каждого элемента в консоль.
    //Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val numbers3 = intArrayOf(1, 2, 3, 4, 5)
    for (number in numbers3) {
        val parity = if (number % 2 == 0) "чётное" else "нечётное"
        println("$number: $parity")
    }


    //Задание 10: Поиск Значения в Массиве по вхождению
    //Создай функцию, которая принимает массив строк и строку для поиска.
    //Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
    //Верни найденный элемент из функции в виде строки.
    val words = arrayOf("автомобиль", "автобус", "самолет", "поезд")
    val searchString = "лет"
    val result = findSubstring(words, searchString)
    println(result)
}

fun findSubstring(array: Array<String>, search: String): String {
    for (word in array) {
        if (word.contains(search)) {
            return word
        }
    }
    return "Не найдено" // Если не найдено, возвращаем сообщение
}



