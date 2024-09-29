package org.ian.kotlincourse.lesson8

fun main() {
    //println(string("Это невозможно выполнить за один день"))
    //println(string2("Я не уверен в успехе этого проекта"))
    //println(string3("Произошла катастрофа на сервере"))
    //println(string4("Этот код работает без проблем"))
    //println(string5("Удача"))


    //1
    //val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    //dateTime(log)

    //2
    //val cardNumber = "4539 1488 0343 6467"
    //val coverNumber = coverNumber(cardNumber)
    //println(coverNumber)

    //3
    //val email = "username@example.com"
    //val formattedEmail = formatEmail(email)
    //println(formattedEmail)

    //4
    //val path = "C:/Пользователи/Документы/report.txt"
    //val fileName = extractFileName(path)
    //println(fileName)

    //5
    //val phrase = "Объектно-ориентированное программирование"
    //val abbreviation = abbreviationOf(phrase)
    //println(abbreviation)
}

fun string (string: String) : String{
    return when {
        string.contains("невозможно") -> string.replace("невозможно", "совершенно точно возможно, просто требует времени")
        else -> ""
    }
}

fun string2 (string: String) : String {
    return when {
        string.startsWith("Я не уверен") -> "$string, но моя интуиция говорит об обратном"
        else -> ""
    }
}

fun string3 (string: String) : String{
    return when{
        string.contains("катастрофа") -> string.replace("катастрофа", "интересное событие")
        else -> ""
    }
}

fun string4 (string: String) : String{
    return when{
        string.endsWith("без проблем") -> string.replace("без проблем", "с парой интересных вызовов на пути")
        else -> ""
    }
}

fun string5 (string: String) : String{
    return when{
        string.isNotEmpty() -> "Иногда,$string, но не всегда"
        else -> ""
    }
}



//Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//Описание: У вас есть строка лога вида "Пользователь вошел в систему
//-> 2021-12-01 09:48:23". Извлеките отдельно дату и время из этой
//строки и сразу распечатай их по очереди.


//1
fun dateTime(log: String) {
    val index = log.indexOf("->") + 2
    val dateTime = log.substring(index).trim()
    val (date, time) = dateTime.split(" ")
    println("Дата: $date")
    println("Время: $time")
}

//2
fun coverNumber (number: String): String {
    val cardNumber = number.replace(" ", "")
    val cover = "*".repeat(number.length - 4) + number.takeLast(4)

    return cover
}

//3
fun formatEmail(email: String): String {
    return email.replace("@", " [at] ").replace(".", " [dot] ")
}

//4
fun extractFileName (path: String): String {
    return path.substringAfterLast("/")
}

//5
fun abbreviationOf(phrase: String): String {
    val separators = " -,"
    val words = phrase.split(*separators.toCharArray())
    var abbreviation = ""
    for (word in words) {
        if (word.isNotEmpty()) {
            abbreviation += word[0]
        }
    }
    return abbreviation.uppercase()
}
