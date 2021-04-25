package all

const val STR: String = "STR"


class MyKotlin(private val value: Int) {

    private val byte: Byte = 0
    private val short: Short = 0
    private val int: Int = 1
    private val long: Long = 1L
    private val float: Float = int.toFloat()
    private val float1: Float = 1.toFloat()
    private val double: Double = .5
    private val char: Char = 'c'
    var boolean: Boolean = true

}


fun main(args: Array<String>) {

    val byte: Byte = 0
    val short: Short = 0
    val int: Int = 1
    val long: Long = 1L
    val float: Float = int.toFloat()
    val double: Double = .5
    val char: Char = 'c'
    val boolean: Boolean = true
    val str: String = "$byte $short $int $long $float $double $char $boolean"
    val any: Any? = long as? String

    println(str)
    println(any)

    if (double is Double) println(true) else println(false)

    var int1: Int?
    int1 = null

    if (int1 is Int?) println(int1 ?: "1")

    val myKotlin = MyKotlin(1)
    myKotlin.boolean = true


    val string: String? = null

    val strCount: Int? = string?.length ?: -1
    println(strCount)
    val strCount1: Int? = string!!.length
    println(strCount1)


}
