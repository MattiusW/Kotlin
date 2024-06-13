package klasy

open class Worker(
    open var name: String = "Unknown",
    open var surname: String = "Worker",
    var experience: Int = 0,
    var salary: Int = 0) {

    override fun toString(): String {
        return "${name}, ${surname}, exp : ${experience}, salary: ${salary}"
    }
}