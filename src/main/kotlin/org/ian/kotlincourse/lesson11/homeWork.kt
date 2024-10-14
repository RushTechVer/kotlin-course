package org.ian.kotlincourse.lesson11

fun main() {
    //Задание 1: Создание Пустого Словаря
    //Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

    fun main() {
        val emptyMap: Map<Int, Int> = mapOf()

        println(emptyMap)
    }


    //Задание 2: Создание и Инициализация Словаря
    //Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val myMap2: Map<Float, Double> = mapOf(
        1.0f to 1.1,
        2.0f to 2.2,
        3.0f to 3.3
    )
    println(myMap2)


    //Задание 3: Создание Изменяемого Словаря
    //Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val mutableMap3: MutableMap<Int, String> = mutableMapOf()
    mutableMap3[1] = "Первый"
    mutableMap3[2] = "Второй"
    mutableMap3[3] = "Третий"


    mutableMap3[2] = "Обновленный Второй"

    println(mutableMap3)


    //Задание 4: Добавление Элементов в Словарь
    //Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    val mutableMap4: MutableMap<Int, String> = mutableMapOf(
        1 to "Первый",
        2 to "Второй"
    )

    println("Исходный словарь: $mutableMap4")

    mutableMap4[3] = "Третий"
    mutableMap4[4] = "Четвертый"

    println("Обновлённый словарь: $mutableMap4")


    //Задание 5: Получение Значений из Словаря
    //Используя словарь из предыдущего задания, извлеките значение, используя ключ.
    //Попробуй получить значение с ключом, которого в словаре нет.
    val mutableMap5: MutableMap<Int, String> = mutableMapOf(
        1 to "Первый",
        2 to "Второй",
        3 to "Третий",
        4 to "Четвертый"
    )

    val value1 = mutableMap5[2]
    println("Значение по ключу 2: $value1")

    val value2 = mutableMap5[5]
    println("Значение по ключу 5: $value2")


    //Задание 6: Удаление Элементов из Словаря
    //Удалите определенный элемент из изменяемого словаря по его ключу.
    val mutableMap: MutableMap<Int, String> = mutableMapOf(
        1 to "Первый",
        2 to "Второй",
        3 to "Третий",
        4 to "Четвертый"
    )

    println("Исходный словарь: $mutableMap")

    mutableMap.remove(3)

    println("Обновлённый словарь после удаления ключа 3: $mutableMap")


    //Задание 7: Перебор Словаря в Цикле
    //Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
    //Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val myMap: MutableMap<Double, Int> = mutableMapOf(
        1.0 to 2,
        2.0 to 0,
        3.0 to 1,
        4.0 to 4
    )

    for ((key, value) in myMap) {
        val result = if (value != 0) {
            key / value
        } else {
            "бесконечность"
        }
        println("Результат деления $key на $value: $result")
    }


    //Задание 8: Перезапись Элементов Словаря
    //Измените значение для существующего ключа в изменяемом словаре.
    val mutableMap8: MutableMap<Int, String> = mutableMapOf(
        1 to "Первый",
        2 to "Второй",
        3 to "Третий"
    )

    println("Исходный словарь: $mutableMap8")

    mutableMap8[2] = "Обновленный Второй"

    println("Обновлённый словарь: $mutableMap8")


    //Задание 9: Сложение Двух Словарей
    //Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val firstMap: Map<Int, String> = mapOf(
        1 to "Первый",
        2 to "Второй"
    )
    val secondMap: Map<Int, String> = mapOf(
        3 to "Третий",
        4 to "Четвертый"
    )

    val combinedMap: MutableMap<Int, String> = mutableMapOf()

    for ((key, value) in firstMap) {
        combinedMap[key] = value
    }

    for ((key, value) in secondMap) {
        combinedMap[key] = value
    }

    println("Объединённый словарь: $combinedMap")


    //Задание 10: Словарь с Сложными Типами
    //Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
    //Добавьте несколько элементов в этот словарь.
    val myMap10: MutableMap<String, List<Int>> = mutableMapOf()

    myMap10["Первый"] = listOf(1, 2, 3)
    myMap10["Второй"] = listOf(4, 5, 6)
    myMap10["Третий"] = listOf(7, 8, 9)

    println("Словарь: $myMap10")


    //Задание 11: Использование Множества в Качестве Значения
    //Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
    //Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
   //Распечатай полученное множество.
    val myMap11: MutableMap<Int, MutableSet<String>> = mutableMapOf()

    myMap11[1] = mutableSetOf("Первый", "Второй")
    myMap11[2] = mutableSetOf("Третий", "Четвертый")

    val mySet = myMap11[1]

    mySet?.add("Пятый")

    println("Множество для ключа 1: $mySet")


    //Задание 12: Поиск Элемента по Значению
    //Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5
    //в качестве первого или второго значения.
    val myMap12: Map<Pair<Int, Int>, String> = mapOf(
        Pair(1, 2) to "Первый",
        Pair(5, 3) to "Второй",
        Pair(4, 5) to "Третий",
        Pair(2, 4) to "Четвертый"
    )

    for ((key, value) in myMap12) {
        if (key.first == 5 || key.second == 5) {
            println("Найдена пара: $key, значение: $value")
        }
    }
}