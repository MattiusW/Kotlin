import java.lang.NumberFormatException

fun main(args: Array<String>) {
    print("Podaj liczbę nie ujemną: ")

    //!! -- Deklaracja, że na 100% nie jest nullem
    //? -- Może być null

    //catch (e: Exception) -- wyłapujemy wszystkiego rodzaju wyjatki

    try {
        val input = readLine()!!.toInt()
        if (input == 0 || input == 1) println("Wynik to: 1")
        else {
            var silnia = 1
            for (i in 2..input) {
                silnia *= i
            }
            println("Wynik = $silnia")
        }
    }catch (e: NumberFormatException){
        print("Podaj liczbe całkowitą!!!")
    }
}