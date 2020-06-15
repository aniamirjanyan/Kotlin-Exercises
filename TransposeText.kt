fun main(args: Array<String>) {
    var c: Char = 'a'
    val list = ArrayList<Char>()

    while (c <= 'z') {
        list.add(c)
        ++c
    }

    // println(list)

    fun transpose(ch: Char) {
        for (i in 0 until list.size) {
            if (list[i] == ch) {
                val a: Char = list[i + 2]
                print(a)
            }
        }
    }

    transpose('b')
}