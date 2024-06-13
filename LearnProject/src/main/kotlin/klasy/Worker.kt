package klasy

class Worker(
    val name: String = "Unknown",
    val surname: String = "klasy.Worker",
    var experience: Int = 0,
    var salary: Int = 0) {

    init {
        println("Name: ${name}")
        println("Surname: ${surname}")
        println("Exprience: ${experience}")
        println("Salary: ${salary}")
    }
}