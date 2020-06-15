import java.util.*

fun main() {
    // setting the colors and values in a map
    val map = mapOf(0 to "black", 1 to "brown", 2 to "red",
        3 to "orange", 4 to "yellow", 5 to "green",
        6 to "blue", 7 to "violet", 8 to "grey", 9 to "white"
    )

    // getting user input
    val reader = Scanner(System.`in`)
    print("Enter a color: ")

    val input1: String = reader.nextLine()
    println("You entered: $input1")

    // conversion method
    fun convert(s: String) {
        for ((number, color) in map) {
            if (color == s) {
                print("The value of the color $s is $number")
            }
        }
    }
    convert(input1)
}