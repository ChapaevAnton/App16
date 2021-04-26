package forif

// TODO: 26.04.2021 16.4.5

fun main() {


    var date: String? = ""

    for (i in 1..10) {

        when (date?.length) {

            0 -> for (x in 0..3) if (x == 0) date += x
            1 -> for (x in 0..9) if (x == 9) date += x
            2 -> date += '.'
            3 -> for (x in 0..1) if (x == 0) date += x
            4 -> for (x in 0..9) if (x == 7) date += x
            5 -> date += '.'
            6 -> for (x in 0..9) if (x == 1) date += x
            7 -> for (x in 0..9) if (x == 9) date += x
            8 -> for (x in 0..9) if (x == 8) date += x
            9 -> for (x in 0..9) if (x == 4) date += x
        }

    }

    println(date)


}