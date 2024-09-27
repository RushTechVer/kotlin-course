package org.ian.kotlincourse.lesson7

fun main() {

    for (i in 1..5) {
        println(i)
    }
    println("---")
   //Напишите цикл for, который выводит числа от 1 до 5.


    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }
    println("---")
    //Напишите цикл for, который выводит четные числа от 1 до 10.

    for (i in 5 downTo 1) {
        println(i)
    }
    println("---")
    //Создайте цикл for, который выводит числа от 5 до 1.

    for (i in 10 downTo 1) {
        if (i % 2 == 0) {
            println(i)
        }
    }
    println("---")
    //Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.


    for (i in 1..20 step 3) {
        println(i)
    }
    println("---")
    //Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.

    for (i in 1 until 9) {
        println(i)
    }
    println("---")
    //Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).

    for (i in 3 until 15) {
        println(i)
    }
    println("---")
    //Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.

    var i = 1
    while (i <= 5) {
        println(i * i)
        i++
    }
    println("---")
    //Создайте цикл while, который выводит квадраты чисел от 1 до 5.


    var number = 10
    while (number >= 5) {
        println(number)
        number--
    }
    println("---")
    //Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль


    var i1 = 5
    do {
        println(i)
        i--
    } while (i >= 1)
    println("---")
    //Используйте цикл do...while, чтобы вывести числа от 5 до 1.


    var counter = 5
    do {
        println(counter)
        counter++
    } while (counter < 10)
    println("---")
    //Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.

    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println(i)
    }
    println("---")
    //Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.

    var number1 = 1
    while (true) {
        println(number)
        if (number == 10) {
            break
        }
        number++
    }
    println("---")
    //Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.

    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
    println("---")
    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.

    var number2 = 1
    while (number <= 10) {
        if (number % 3 == 0) {
            number++
            continue
        }
        println(number)
        number++
    }
    println("---")
    //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.



    for (i in 1..10) {
        for (j in 1..10) {
            print(i * j)
            print(" ")
        }
        println()
    }
    println("---")


}






