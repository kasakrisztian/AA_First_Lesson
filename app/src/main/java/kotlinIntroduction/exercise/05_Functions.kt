package kotlinIntroduction.exercise

//Sima paraméter nélküli fv.
//Van visszatérési értéke: Unit (olyan mint a void), csak nem kell kiírni.
fun hello() {
    println("Hello")
}

//Uniton kívül lehet más visszatérési értéke is
fun returnsAFour(): Int {
    return 4
}

//Lehet még egyszerűbb is
fun returnsAFour2(): Int = 4

//Itt is működik a type inference, meg az egyszerűsítés
fun returnASix() = 6

//A függvényeknek lehet paramétere is
fun hello(name: String) {
    println("Hello $name")
}

//Több paraméter is lehet, és persze ezt is lehet egyszerűsíteni
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sum2(x: Int, y: Int) = x + y

//A függvényeknek lehet default paramétere, nem kell sok overload-olt fv.
fun sum3(x: Int, y: Int, z: Int = 0, w: Int = 0) = x + y + z + w

//Írj függvényt, ami kiszámolja két szám legnagyobb közös osztóját
fun lnko(a: Int, b:Int): Int {
    var temp: Int
    var szam1 = a
    var szam2 = b
    while(szam2 > 0) {
        temp = szam2
        szam2 = szam1 % szam2
        szam1 = temp
    }
    return szam1
}

fun main() {
    hello()
    println(returnsAFour())
    println(returnsAFour2())
    println(returnASix())
    hello("Krisztián")
    println(sum(5, 6))
    println(sum2(10, 20))
    println(sum3(10, 20, w = 4))
    print("Legnagyobb közös osztó:")
    println(lnko(1071, 462))

}