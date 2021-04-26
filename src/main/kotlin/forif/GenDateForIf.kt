package forif

// TODO: 26.04.2021 16.4.5

fun main() {

    val array = arrayOf(1, 2, 3, 4, 5, 6)
    println(array.contentToString())
    array.forEach { print(it) }
    println()
    println(array.toStringArray())
    println(genDate("09.07.1984"))
    println(genDate("01.01.2021"))
    println(genDate("26.04.2021"))


}

fun <T> Array<T>.toStringArray(): String {
    return this.joinToString(prefix = "[", postfix = "]", transform = { item ->
        item.toString()
    })
}

private fun genDate(strDate: String): String? {


    val array: Array<String> = strDate.map { it.toString() }.toTypedArray()
    var date = ""

    for (i in 0..9) {

        when (date?.length) {

            0 -> for (x in 0..3) if (x == array[i].toInt()) date += x
            1 -> for (x in 0..9) if (x == array[i].toInt()) date += x
            2 -> date += array[i]
            3 -> for (x in 0..1) if (x == array[i].toInt()) date += x
            4 -> for (x in 0..9) if (x == array[i].toInt()) date += x
            5 -> date += array[i]
            6 -> for (x in 0..9) if (x == array[i].toInt()) date += x
            7 -> for (x in 0..9) if (x == array[i].toInt()) date += x
            8 -> for (x in 0..9) if (x == array[i].toInt()) date += x
            9 -> for (x in 0..9) if (x == array[i].toInt()) date += x
        }

    }

    return date
}