package collections

// TODO: 25.04.2021 16.3.4

fun main() {
    val counter = Counter()

    println(counter.countThree())
}

class Counter {
    private val list = mutableListOf<Int>()

    init {
        repeat(100) {
            list.add((1..3).random())
        }
    }

    fun countThree(): Int {
        return list.count { it == 3 }
    }
}