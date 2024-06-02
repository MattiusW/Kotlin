fun main(args: Array<String>) {

    var roman = romanToString("VI")
    println(roman)
}

fun romanToString(s: String): Int {

    var ans: Int = 0

    val m = hashMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    for (i in 0 until s.length) {
        if (i < s.length - 1 && m[s[i]]!! < m[s[i + 1]]!!) {
            ans -= m[s[i]]!!
        }
        else {
            ans += m[s[i]]!!
        }
    }
    return ans
}