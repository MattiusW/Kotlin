fun doOperation(a: Int,
                b: Int,
                operation: (Int, Int) -> Int): Int {

    return operation(a,b)
}

fun main(args: Array<String>){

    val wynik = doOperation(2,5, {a,b -> a-b })
    println(wynik)


    // lambda to funkcja anonimowa, nie robi sie zaczepow zmiennych
    val lambda = {a: Int, b: Int ->
        a+b
        a-b
        a*b
    }

    val wynik2 = doOperation(10, 20, lambda)

    println("Wszystkie operacje zostana wykonane, ale zwroci sie tylko ostatnia")
    println(wynik2)

    val wynik_lambda = doOperation(2,3) {a, b -> a + b}

    println(wynik_lambda)
}