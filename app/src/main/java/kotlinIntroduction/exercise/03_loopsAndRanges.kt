package kotlinIntroduction.exercise

fun main() {
    for (a in 1..100) {
        println(a)
    }

    val numbers: IntRange = 1..100
    for (a in numbers) {
        println(a)
    }

    //Ez nem csinál semmit, mert ez üres halmas
    for (a in 100..1) {
        println(a)
    }

    //Helyette van downTo
    for (a in 100 downTo 1){
        println(a)
    }

    val cities = listOf("Győr", "Budapest", "Tótkomlós")
    for (a in cities) {
        println(a)
    }

    cities.forEach() {
        println(it)
    }

    /*cities.forEach() {city ->
        println(city)
    }*/

    //Elötesztelő ciklus
    var i = 100
    while (i > 0) {
        println(i)
        i--
    }

    //Hátultesztelő ciklus
    do {
        i++
        println(i)
    } while(i < 100)


    //Órai feladat - két szám legnagyobb közös osztója
    var temp = 0
    var szam1 = 1071
    var szam2 = 462

    print("$szam1 és $szam2 legnagyobb közös osztója: ")

    while (szam2 > 0) {
        temp = szam2
        szam2 = szam1 % szam2
        szam1 = temp
    }

    println("$temp")

    //Házi feladat - Van egy n fokú létrád, minden lépésnél 1 vagy 2-t lépsz felfelé.
    //Számold ki hányféleképp juthatsz fel a létrán

    //Pl 1 fokú létra: 1 féleképp
    // 2 fokú létra: 2, 1+1=2, tehát 2 db
    // 3 fokú: 1+2, 2+1, 1+1+1, 3 db

}