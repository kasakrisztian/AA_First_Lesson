package kotlinIntroduction.exercise

fun main() {
    val myString = "Not Empty"

    if (myString == "") {
        println("Empty")
    } else if (myString.startsWith("a")) {
        println("Stars with a")
    } else {
        println("Not empty")
    }

    //If egy kifejezés is, van visszatérési értéke
    //A visszatérési érték a közös ős, "Any", ami kb a java-s object
    val result = if (myString == "") {
        println("Empty")
        0
    } else {
        "Not empty"
    }
    println(result)

    //Érdekesség, hogy nem használhatunk if-el else nélkül, ha van visszatérési érték,
    //de ha nincs, akkor igen
    val temp = if (myString == "") {
        println("Empty")
    } else {
        4
    }

    //switch/case szerkezet
    //when visszatérési értéke itt Unit, olyan mint a void
    when (result) {
        is String -> println("It is a string")
        is Int -> println("It is an int")
    }

    //És szintén van visszatérése, és szintén kell else ág
    val result2 = when (result) {
        is String -> "It is a string"
        is Int -> "It is an int"
        else -> "Alma"
    }

    //Nem kötelező a result paramétere, és ilyenkor lehet bonyolultabb kifejezés is
    val result3 = when {
        result is String -> "It is a string"
        result is Int && result > 0 -> "Its is an int"
        else -> "Alma"
    }
}