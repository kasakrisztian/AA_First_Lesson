package kotlinIntroduction

interface Animal {
    fun say()
}

class Fox : Animal {
    override fun say() {
        println("Ring-ding-ding-ding-ding")
    }
}

class Wolf: Animal {
    override fun say() {
        println("Woof")
    }
}

fun main() {
    var wolf:Animal = Wolf()
    wolf.say()
    wolf = Fox()
    wolf.say()
}