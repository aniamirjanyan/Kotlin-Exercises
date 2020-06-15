// Find the difference between the square of the sum
// and the sum of the squares of the first N natural numbers.

const val n = 10;

fun main() {
    print("The difference between square of sum and sum of squares for n = $n is ${difference()}.")
}

fun difference (): Int {
    return squareOfSum(n) - sumOfSquares(n)
}

fun square(num: Int): Int {
    return num * num
}

fun sumOfSquares(n: Int): Int {
    var sum = 0
    for (i in 0..n) {
        val temp = square(i)
        sum += temp
    }
    return sum
}

fun squareOfSum(m: Int): Int {
    var sum = 0
    for (i in 0..n) {
        sum += i
    }
    return square(sum)
}