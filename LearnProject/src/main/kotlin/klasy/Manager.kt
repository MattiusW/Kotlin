package klasy

class Manager(private val workersList: ArrayList<Worker> = ArrayList()) {

    fun addNewWorker(worker: Worker): Boolean {
        return workersList.add(worker)
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

}