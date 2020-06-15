import java.util.*

fun main() {
    // getting user input
    val reader = Scanner(System.`in`)
    print("Enter the sentence: ")
    var sen: String = reader.nextLine()

    // getting rid of spaces
    sen = sen.replace("\\s".toRegex(), "")

    // converting the sentence to list of chars
    val chars: List<Char> = sen.toList()
    println(chars)

    // checking if the sentence is a Pangram
    fun isPangram(input: List<Char>): Boolean {
        for (letter in 'a'..'z') {
            if(!input.contains(letter)) {
                return false
            }
        }
        return true
    }

    if (isPangram(chars)) {
        println("The sentence is a Panagram")
    } else {
        print("The sentence is not a Panagram")}
}