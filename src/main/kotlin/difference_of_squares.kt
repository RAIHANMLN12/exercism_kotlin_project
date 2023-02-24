fun main() {
    val n = readLine()!!.toInt()
    var sum1 = 0
    var sum2 = 0

    for (i in 1 ..n) {
        sum1 += i
    }

    for (i in 1..n) {
        sum2 += i  *  i
    }

    if (sum1 >= sum2 ) {
        println(sum1 - sum2)
    } else {
        println(sum2 - sum1)
    }

}