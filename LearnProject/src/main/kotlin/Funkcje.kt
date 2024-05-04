//Po dwukropku zwracamy typ, domyślnie zwracamy typ Unit
fun dodaj(a: Int, b: Int): Int{
    return a + b;
}

fun czyParzysta(liczba: Int): Boolean{
    return liczba%2==0
//    if(liczba%2 == 0) return true
//    else return false
}

fun silnia(input: Int): Int {
    //Nie zwracamy 2 razy tylko raz
    return if(input == 0 || input == 1) 1
    else{
        var silnia = 1
        for (i in 2..input) {
            silnia *= i
        }
        silnia
    }
}

//Opcjonalne parametry
fun opcjonalneParametry(liczba: Int, mnoznik: Int = 2): Int{
    return liczba * mnoznik
}

//Dobre praktyki
fun dobrePraktyki(id: Int, numer: Int, pesel: Int): Int {
    return id; numer; pesel
}

fun main(args: Array<String>) {
    val wynik = dodaj(10, 20)
    println(czyParzysta(wynik))
    val input = silnia(5)
    println(input)
    println(opcjonalneParametry(20))
    println(opcjonalneParametry(20, 30))

    //Mozna zamieniac parametry nazywajac
    val zamienioneParametry = opcjonalneParametry(mnoznik = 5, liczba = 4)
    println(zamienioneParametry)

    //Dobre praktyki wypisywac nazwy parametrow
    dobrePraktyki(
        id = 1,
        numer = 10,
        pesel = 1234
    )

}