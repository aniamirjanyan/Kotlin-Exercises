import java.util.*

// Given a number, find the sum of all the unique multiples
// of particular numbers up to but not including that number.

fun main () {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    val num: Int = reader.nextInt()

    // we take the limit as 50
    val limit = 50

    print(sumOfMultiples(num, limit))
}

fun sumOfMultiples(num: Int, limit: Int): Int {
    var sum = 0
    for (i in 0..limit) {
        if (i % num == 0) {
            sum += i
        }
    }
    return sum
}