package collections

import kotlin.text.split as split1

fun main() {

    // TODO: 25.04.2021 zip 
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf("one", "two", "three", "four")

    val map: Map<Int, String> = list1.zip(list2).toMap()

    println(list1 zip list2)
    println(list1.zip(list2) { a, b -> "$a$b" })
    println(map)

    // TODO: 25.04.2021 joinTo

    println(
        list1.joinTo(
            buffer = StringBuilder("Числовой ряд:"),
            prefix = "[",
            postfix = "]",
            limit = 3,
            transform = { value -> value.toDouble().toString() })
    )
    println(
        list2.joinTo(
            buffer = StringBuilder("Числовой ряд:"),
            separator = "-",
            transform = { value -> value.toUpperCase() })
    )
    val str = list1.joinToString(separator = "+", limit = 2, truncated = ">>>")

    val list3 = str.split1("+", ignoreCase = false, limit = 3)
    println(list3.minus(">>>"))

    // TODO: 25.04.2021 Sequence

    val seq = sequenceOf("one", "two", "three", "four"); println(seq.joinToString())
    val list4 = seq.toMutableList(); println(list4)
    val seq1 = list4.asSequence(); println(seq1.joinToString())

    var count = 10
    var seq2 = generateSequence { (count--).takeIf { it > 0 } }; println(seq2.toList())

    seq2 = generateSequence(1) { int -> (int + 1).takeIf { it <= 50 } }; println(seq2.toList())


}