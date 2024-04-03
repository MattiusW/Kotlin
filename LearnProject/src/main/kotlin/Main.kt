fun main(args: Array<String>) {

    var a = 20
    var b = 30
    var c = '!'
    var s = "Hello World Kotlin"

    println("Wynik " + "A: " + a + " + "+ "B: " + b + " równa się = " + (a + b))
    println(s + c)

    //var zmienna: Typ = wartość
    println("Pełny zapis w Kotlinie:")
    println("var zmienna: Typ = wartość")

    var number: Float = 10.0F;
    println(number)

    val CONST = "val to Stała"
    var isTrue = true
    var isFalse = false

    println(CONST)
    println(isTrue)
    println(isFalse)


    // $ odwoluje sie do zmiennej w Stringu
    if(a > b){
        println("A = $a jest wieksze")
    }
    else{
        println("B = $b jest większe")
    }

}
