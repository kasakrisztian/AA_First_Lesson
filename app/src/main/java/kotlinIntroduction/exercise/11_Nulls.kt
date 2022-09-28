package kotlinIntroduction.exercise

//Alapértelmezetten a kotlin null safe!

fun main() {
    var message: String = "A message"
    println(message.length)

    //Alapértelmezetten a változók nem vehetnek fel null értéket.
    // Viszont ha a változó típusánál pl String van,
    // akkor biztosak lehetünk benne, hogy az sosem lehet null.
    //message = null

    //De persze van olyan hogy szükségünk van null-ra. Ilyenkor ezt a ?-el kell jelölni.
    var nullMessage: String? = null

    //De ilyenkor már nem fordul le a kódunk, mert a nullMessage null.
    //println(nullMessage.length)

    nullMessage = "Helló"
    println(nullMessage.length)

    //null check
    var nullMessage2: String? = null
    if (nullMessage2 != null) {
        println(nullMessage2.length)
    }

    //Safe operator, ha nem null, akkor végrehajtja, egyébként nem
    println(nullMessage2?.length)

    class Service {
        fun evaulate(): String? = null
    }

    class ServiceProvider {
        fun createService(): Service? {
            return null
        }
    }

    val serviceProvider = ServiceProvider()
    println(serviceProvider.createService()?.evaulate()?.length)

    println(nullMessage2!!.length)

}