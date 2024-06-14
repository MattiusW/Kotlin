package klasy

fun main(args: Array<String>) {
    val workerOne = Worker()
    val workerTwo = Worker("John", "Smith", 10, 25_000)
    val workerThree = Worker("Stan", "Doe", 5, 20_000)
    val workerFour = Worker("Maria", "Anthony", 7, 10_000)

    println("Manager menu")

    val manager = Manager()
    manager.name = "Mateusz"
    manager.surname = "W"

    val newWorkers = listOf(workerThree, workerFour)

    println(manager)

    manager.addNewWorker(workerTwo)
    manager.addNewWorker(workerOne)

    println(manager.showWorkers())

    manager.addAllWorkers(newWorkers)

    println("New workers")
    println(manager.showWorkers())


}