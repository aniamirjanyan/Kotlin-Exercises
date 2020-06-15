// Given a number determine whether or not it is valid per the Luhn formula.

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    print("Enter the card number: ")
    var cardNum: String = reader.nextLine()

    cardNum = cardNum.replace(" ", "")
    if (isValid(cardNum)) {
        doubleEverySecond(cardNum)
    }

}

// checking if the entered string is valid
fun isValid(cardNum: String): Boolean {
    cardNum.let { s ->
        if (s.length < 2) return false
        if (s.any { !it.isDigit() }) return false
    }
    return true
}


// function to Double every second integer
fun doubleEverySecond(nums: String) {
    val array: Array<Int> = nums.toCharArray()
        .map { it.toInt() }
        .toTypedArray()

    print(array)
}