package klasy

class Worker(
    val name: String = "Unknown",
    val surname: String = "Worker",
    var experience: Int = 0,
    var salary: Int = 0) {

    override fun toString(): String {
        return "${name}, ${surname}, exp : ${experience}, salary: ${salary}"
    }
}