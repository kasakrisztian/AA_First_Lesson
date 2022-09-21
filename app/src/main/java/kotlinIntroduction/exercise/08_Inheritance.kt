package kotlinIntroduction.exercise

//Minden osztály az Anyből öröklődik
class Apple() : Any()

class Banana()

//Open-re kell rakni az osztályt, hogy öröklődni lehessen
open class Person {
    //Hasonlóan az open kell akkor is, ha felül szeretnénk írni egy metódust.
    open fun validate() {
        println("Person.validate")
    }
}

class Student : Person() {
    override fun validate() {
        super.validate()
        println("Student.validate")
    }
}
fun main() {
    val s = Student()
    s.validate()
}