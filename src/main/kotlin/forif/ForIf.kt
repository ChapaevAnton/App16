package forif

// TODO: 25.04.2021 16.4

fun main() {

    val x = 1
    val y = 20

    val z = if (x > y) x else y
    println(z)

    for (i in 0..9) print(i)
    println()
    for (i in 0 until 10) print(i)
    println()
    for (i in 9 downTo 0 step 2) print(i)
    println()
    val value = when (40) {
        in 10..20 -> 1
        in 30..40 -> 2
        in 50..60 -> 3
        in 70..80 -> 4
        else -> 0
    }
    println(value)

    repeat(10) { index -> println("count $index") }

    val list1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    list1.forEach { print("{$it}") }
    println()
    list1.forEachIndexed { index, item -> print(if (index % 2 == 0) item else 0) }

    println()

    repeat(list1.size){index-> print("${list1[index]}")}

}