package kotlinIntroduction.exercise

import java.lang.Exception

//1. megoldás: a jó számok listáját visszaadva
/*
fun digitCalculator(n: Int): List<Int> {
    var result = mutableListOf<Int>()
    var count = 0
    var number = 19
    while (count != n) {
        var sum = 0
        var numString = number.toString()
        numString.forEach {
            sum += it.digitToInt()
        }
        if (sum == 10) {
            result.add(number)
            count++
        }
        number++
    }

    return result
}*/

fun digitCalculator(number: Int): Boolean {
    val numString = number.toString()
    var sum = 0
    numString.forEach {digit ->
        sum += digit.digitToInt()
    }
    val result = when {
        sum is Int && sum == 10 -> true
        else -> false
    }
    return result
}

fun main() {
    var n = 0
    do {
        print("Adja meg, hány darab számnak az összegére kíváncsi (0-nál nagyobb legyen): ")
        try {
            val input = readLine()
            n = Integer.valueOf(input)
        } catch (e: Exception) {
        }
    } while (n <= 0)

    val numbersUpToALot = generateSequence(seed = 19) {previousNumber ->
        if (previousNumber < Int.MAX_VALUE) {
            previousNumber + 1
        } else {
            null
        }
    }
    val firstNGoodNumbers = numbersUpToALot
        .filter { number -> digitCalculator(number) }
        .take(n)
        .forEach { number -> println(number) }
}