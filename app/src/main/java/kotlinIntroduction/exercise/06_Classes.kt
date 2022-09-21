package kotlinIntroduction.exercise

class Customer

fun customerInstance() {
    val c = Customer()
}

class Customer2() {
    var id = 12

    //És ugyanúgy lehet immutable is
    var name: String = ""
}

fun customer2Instance() {
    val c = Customer2()
    c.id = 4
    c.name = "Béla"
}

//Konstruktor paraméterek
class Customer3(initId: Int, initName: String) {
    val id = initId
    var name: String = initName
}

//És igazából tovább egyszerűsíthető, így a konstruktor paraméterből property lesz.
class Customer4(val id: Int, var name: String)

//A property-knek mint a fv-eknél lehet default érték.

//Mindenféle logikát rakhatunk az init blokkba.

class Customer5(val id: Int, var name: String) {
    init {
        name = name.uppercase()
    }
}

//És lehet secondary konstruktorokat is létrehozni
class Customer6(val id: Int, var name: String) {
    constructor(id: Int, firstName:String, lastName: String) : this(id, "$firstName, $lastName") {
        //És ide jöhet ugyanaz, mint az init blokknál
        name = name.uppercase()
    }
}


fun main() {
    customerInstance()
    customer2Instance()
}