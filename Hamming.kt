// Calculate the Hamming Distance between two DNA strands

fun main() {
    // the DNA
    val dna1 = "GAGCCTACTAACGGGAT"
    val dna2 = "CATCGTAATGACGGCCT"

    hamming(dna1, dna2)
}

fun hamming(s1: String, s2: String) {
    if (s1 == s2) {
        println("There is no hamming distance.")
    } else {
        println("The hamming distance is " + s1.zip(s2) {a, b -> a != b}.count {it})
    }
}