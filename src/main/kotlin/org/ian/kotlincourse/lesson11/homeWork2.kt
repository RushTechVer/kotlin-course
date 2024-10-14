package org.ian.kotlincourse.lesson11

fun main() {
    //Напиши решения задач. В каждом случае нужно проанализировать и подобрать оптимальный тип словаря.
    //Задание 6: Словарь Библиотека
    //Ключи - автор книги, значения - список книг
    val library: MutableMap<String, MutableList<String>> = mutableMapOf()

    library["Лев Толстой"] = mutableListOf("Война и мир", "Анна Каренина")
    library["Федор Достоевский"] = mutableListOf("Преступление и наказание", "Идиот")

    library["Лев Толстой"]?.add("Севастопольские рассказы")

    for ((author, books) in library) {
        println("$author: ${books.joinToString(", ")}")
    }


    //Задание 12: Справочник Растений
    //Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val plantDirectory: MutableMap<String, MutableList<String>> = mutableMapOf()

    plantDirectory["Цветы"] = mutableListOf("Роза", "Тюльпан", "Лилия")
    plantDirectory["Деревья"] = mutableListOf("Дуб", "Сосна", "Береза")

    plantDirectory["Цветы"]?.add("Гербера")

    plantDirectory["Суккуленты"] = mutableListOf("Алое", "Кактус")

    for ((plantType, plantNames) in plantDirectory) {
        println("$plantType: ${plantNames.joinToString(", ")}")
    }


    //Задание 8: Четвертьфинала
    //Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val teams: MutableMap<String, MutableList<String>> = mutableMapOf()

    teams["Команда А"] = mutableListOf("Игрок 1", "Игрок 2", "Игрок 3")
    teams["Команда Б"] = mutableListOf("Игрок 4", "Игрок 5")

    teams["Команда А"]?.add("Игрок 6")

    teams["Команда В"] = mutableListOf("Игрок 7", "Игрок 8", "Игрок 9")

    for ((teamName, players) in teams) {
        println("$teamName: ${players.joinToString(", ")}")
    }


    //Задание 9: Курс лечения
    //Ключи - даты, значения - список препаратов принимаемых в дату
    val treatmentSchedule: MutableMap<String, MutableList<String>> = mutableMapOf()

    treatmentSchedule["2023-10-01"] = mutableListOf("Парацетамол", "Ибупрофен")
    treatmentSchedule["2023-10-02"] = mutableListOf("Антибиотик", "Витамин C")

    treatmentSchedule["2023-10-01"]?.add("Калий")

    treatmentSchedule["2023-10-03"] = mutableListOf("Сироп от кашля", "Таблетки от аллергии")

    for ((date, medications) in treatmentSchedule) {
        println("Дата: $date, Препараты: ${medications.joinToString(", ")}")
    }


    //Задание 10: Словарь Путешественника
    //Ключи - страны, значения - словари из городов со списком интересных мест.
    val travelDictionary: MutableMap<String, MutableMap<String, List<String>>> = mutableMapOf()

    travelDictionary["Италия"] = mutableMapOf(
        "Рим" to listOf("Колизей", "Фонтан Треви"),
        "Флоренция" to listOf("Уффици", "Санта-Мария-дель-Фьоре")
    )

    travelDictionary["Франция"] = mutableMapOf(
        "Париж" to listOf("Эйфелева башня", "Лувр"),
        "Лион" to listOf("Старый Лион", "Площадь Республики")
    )

    val romeAttractions = travelDictionary["Италия"]?.get("Рим")?.toMutableList()
    romeAttractions?.add("Площадь Испании")
    if (romeAttractions != null) {
        travelDictionary["Италия"]!!["Рим"] = romeAttractions
    }

    travelDictionary["Испания"] = mutableMapOf(
        "Барселона" to listOf("Саграда Фамилия", "Парк Гуэль")
    )

    for ((country, cities) in travelDictionary) {
        println("Страна: $country")
        for ((city, attractions) in cities) {
            println("  Город: $city, Интересные места: ${attractions.joinToString(", ")}")
        }
    }
}