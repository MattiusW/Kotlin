fun main(args: Array<String>) {

    val tab = arrayOf(1,2,3,4,5)
    println(tab[0])

    for (element in tab){
        print(element)
        print(" ")
    }

    val list = listOf(1f,2f)

    tab[0] = 5
    println(tab[0])

    //ArrayList
    val arrayList = ArrayList<Float>()
    arrayList.add(5f)
    arrayList.add(7f)
    println(arrayList)

    //Lista ktora ma settera
    val mutableList = mutableListOf(3f,4f)
    mutableList[1] = 7f

    println(mutableList)

    val tabString = arrayOf("Zero", "Jeden", "Dwa", "Trzy")

    //Łopatologiczny zapis
    for (i in 0..tabString.size - 1){
        print("$i, ")
    }

    println()
    //Nowoczesny zapis
    for (i in tabString.indices){
        print("$i, ")
    }


}
