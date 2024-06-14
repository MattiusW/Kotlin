package klasy

class Manager(private val workersList: ArrayList<Worker> = ArrayList()) : Worker(){

    //lateinit oznacza wstrzymaniem sie z inicjalizacja pola
    override lateinit var name: String
    override lateinit var surname: String

    fun addNewWorker(worker: Worker): Boolean {
        return workersList.add(worker)
    }


    fun addAllWorkers(list: List<Worker>): Boolean {
        return workersList.addAll(list)
    }

    fun removeWorker(worker: Worker): Boolean {
        return workersList.remove(worker)
    }

    fun showWorkers() {
        println("-------------")
        for (worker in workersList) {
            println(worker)
        }
        println("-------------")
    }

    override fun toString(): String {
        return "Manager name: ${name}, Manager surname: ${surname}"
    }

}