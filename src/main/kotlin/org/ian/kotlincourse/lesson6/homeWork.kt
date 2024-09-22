package org.ian.kotlincourse.lesson6

fun main() {

}

fun getSeason(month: Int): String {
    return when {
        (month > 12) || (month < 1) -> "Неверное значение"
        month == 12 -> "Зима"
        month in 1..2 -> "Зима"
        month in 3..5 -> "Весна"
        month in 6..8 -> "Лето"
        else -> "Осень"
    }
}

fun dogAge(age: Int): Double {
    return when {
        age < 0 -> throw Exception("Неверное значение")
        age <= 2 -> (age * 10.5)
        else -> (2 * 10.5) + ((age -2) * 4)
    }
}

fun chooseTransport(km: Double): String {
    return when {
        km <= 0 -> "Неверное значение"
        km <= 1.0 -> "Можно дойти пешком"
        km in 1.1..4.99 -> "Используйте велосипед"
        else -> "Используйте автомобиль"
    }
}

fun bonusPoints(cash: Double): Int {
    return when {
        cash < 0 -> throw Exception("Сумма покупки не может быть отрицательной")
        cash <= 1000 -> (cash / 100).toInt() * 2
        else -> (cash / 100).toInt() * 5
    }
}

fun fileExtension(type: String): String {
    return when(type) {
        ".txt" -> "Текстовый файл"
        ".jpg" -> "Изображение"
        ".xls" -> "Таблица"
        else -> "Неизвестный тип"
    }
}

fun convertTemperature(temp: Double, type: Char): String {
    return when (type.uppercase()) {
        'C'.toString() -> {
            var fahrenheit = temp * 9 / 5 + 32
            "$fahrenheit F"
        }
        'F'.toString() -> {
            val celsius = (temp - 32) * 5 / 9
            "$celsius C"
        }
        else -> "Неизвестная единица измерения"
    }
}


fun chooseCloth(temperature: Double): String {
    return when {
        temperature <= -30.0 ->"Не выходите из дома"
        temperature < 0.0-> "Наденьте куртку и шапку"
        temperature in 0.0..15.0 -> "Наденьте ветровку"
        temperature > 15.0 && temperature < 35.0 -> "Наденьте футболку и шорты"
        else -> "Не выходите из дома!"
    }
}


fun  ageFotFilm(age: Int): String {
    return when {
        age < 0 -> "Неверное значение"
        age < 13 -> "Детские фильмы"
        age > 13 && age < 18 -> "Подростковыее фильмы"
        else -> "Фильмы 18+"
    }
}