package kotlinIntroduction.exercise

//A kotlinban lehet olyan, hogy függvényeket adunk paraméterül

//Ez egy olyan függvény, aminek 2 paramétere, és egy függvény paramétere van
//ami szintén két int-et vár paraméterül, és egy int-tel tér vissza
fun doIt(x: Int, y: Int, op: (Int, Int) -> Int) {
    println(op(x,y))
}

fun add(x: Int, y: Int) = x + y


fun main() {
    doIt(2, 3, ::add)

    //Ezt meg lehet oldani helyben lambda kifejezésekkel.
    doIt(2, 3, {x: Int, y: Int -> x + y})

    //A fordító itt is kitalálja az elvárt típust, szóval nem kell megadni
    doIt(2, 3, {x,y -> x + y})

    //Ezt a fenti lambda fv-t akár változónak is értékül lehet adni
    //De akkor kell a típus
    val sumLambda = {x: Int, y: Int -> x + y}
    doIt(2, 3, sumLambda)

    //Nem olyan feltünő, de a fordító aláhúzta kicsit hogy ha a függvénynek az utolsó paramétere
    //szintén egy függvény, akkor azt ki lehet szervezni a függvény után.
    doIt(2,3) {x,y -> x + y}

    //Ez elég bután néz ki, de lehetőséget ad nagyon jól olvasható kód írására.
    // (Compose-nál ez sokszor előfordul.)

}