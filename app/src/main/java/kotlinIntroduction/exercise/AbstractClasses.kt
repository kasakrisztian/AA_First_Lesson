package kotlinIntroduction.exercise

//Absztrakt osztályokat nem lehet példányosítani
abstract class StoredEntity() {
    //Lehetnek nem absztrakt metódusai és property-jei
    var isActive = true

    fun status() : String {
        return isActive.toString()
    }

    //absztrakt metódus (nincs body-ja)
    abstract fun store()
    //absztrakt property
    abstract val id: Int
}

class Employee(
    override val id: Int,
    val name: String
) : StoredEntity() {
    //A leszármazottakban, (ha nem absztrakt) akkor kötelező kifejteni az absztrakt osztály
    //absztrakt metódusait
    override fun store() {

    }
}

fun main() {
    //Absztrakt osztály nem példányosítható
    //val storedEntity2 = StoredEntity()

    //Csak a belőle létrehozott osztály.
    val employee = Employee(1, "Gábor")

    val storedEntity : StoredEntity = Employee(1, "Gábor")
}