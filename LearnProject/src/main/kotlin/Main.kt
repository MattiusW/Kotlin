import klasy.Worker

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
    if (a > b){
        println("A = $a jest wieksze")
    }
    else{
        println("B = $b jest większe")
    }

    if (b > 10) {
        println("Sprawdzam warunek if: $b > 10")
    }
    else if (b == 30) {
        println("Sprawdzam warunek else if: $b == 30")
    }
    if (b == 30) {
        println("Sprawdzam warunek if: $b == 30")
    }
    else{
        println("Pozostałość")
    }

    //Pętle for
    for(i in 0..10){
        println(i)
    }

    //Pętla co krok
    for (i in 0..10 step 3) println(i)

    //Pętla w dół

    for (i in 10 downTo 0 step 2) println("Zmienna $i")

    //Pętle WHILE
    var licznik = 0
    while (licznik <= 10) {
        println("Licznik --> $licznik")
        licznik++
    }

    //Petla doWhile

    do {
        println("Warunek sprawdzany jest raz mimo, że pętla jest fałszywa")
    }while (false)


    //When czyli switch

    var liczba = 150

    when(liczba) {
        153 -> {
            println("Jest rowna $liczba")
        }
        is Int -> {
            println("Jest to liczba calkowita")
        }
        in 100..200 -> {
            println("Miesci sie w zakresie od 100 do 200")
        }
        else -> {
            println("ELSE")
        }
    }

    val zmienna = when(liczba){
        153 -> 100
        else -> "Zmienna"
    }

    println(zmienna)

    println(" --- KLASY KOTLIN --- ")


}
