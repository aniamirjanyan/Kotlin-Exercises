fun main() {
    // setting the points for each circle
    val points = mapOf(
        0 to "miss", 1 to "outer",
        5 to "middle", 10 to "inner"
    )

    fun randomThrow(): String {
        // to gain correct probability
        val type = listOf(
            "miss", "miss", "miss", "miss",
            "outer", "outer", "outer",
            "middle", "middle",
            "inner"
        )
        return type.shuffled()[0]
    }

    val random = randomThrow();

    for ((point, circle) in points) {
        if (circle == random) {
            println("You get $point points")
        }
    }

}