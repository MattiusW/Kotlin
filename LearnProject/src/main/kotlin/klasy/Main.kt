package klasy

fun main(args: Array<String>) {
    val workerOne = Worker()
    val workerTwo = Worker("John", "Smith", 10, 25_000)

    println("Manager menu")

    val manager = Manager()

    manager.addNewWorker(workerTwo)
    manager.addNewWorker(workerOne)

    println(manager.showWorkers())

}