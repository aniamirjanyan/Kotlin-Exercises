import java.lang.Exception
import java.lang.IllegalArgumentException
import java.time.LocalDate
import java.util.*
// add exception
fun main() {

    val reader = Scanner(System.`in`)
    print("Enter a date in YYYY-MM-DD format: ")
    var date = LocalDate.now()
    try {
        date = LocalDate.parse(reader.nextLine())
    } catch (e: Exception) {
        throw IllegalArgumentException("Wrong date format.")
    }

    println("You entered $date")

    val newDate = date.plusDays(31)

    println("A giga-second later the date is $newDate")
}