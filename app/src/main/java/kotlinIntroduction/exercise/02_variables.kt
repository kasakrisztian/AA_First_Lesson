package kotlinIntroduction.exercise

fun main() {
    var streetNumber: Int = 4

    println(streetNumber)

    var streetName: String = "Wesselényi"
    println(streetName)

    val zip = "9024"
    //zip = "9025"

    val myLong = 10
    val myReallyLong = 10L

    val myLongAgain: Long = myLong.toLong()

    val myChar = 'C'
    val myString = "C"

    //string interpolation
    val years = 10
    val message = "A decade is $years"

    val name = "Balázs"
    val nameMessage = "Length of $name is ${name.length}"

    println(nameMessage)

    //Órai feladat
    val myName = "Krisztián"
    println("Hello ${myName.uppercase()}")
}