class GiveMePassword {
    var password = ""

    val a = A()
    val b = a

    val num = 1
    val num1 = 1

    val string = "Hi"
    val string1 = "Hei"

    fun getPassword () {
        if (a == b) {
            password += "s"
        } else {
            password += "i"
        }
        if (a == b) {
            password += "w"
        }
        if (b is A) {
            password += "o"
        } else {
            password += "9"
        }
        if (num === num1) {
            password += "r"
        } else {
            password += "m"
        }
        if (string != string1) {
            password += "d"
        }

        println(password)
    }
}

open class A
class B : A()

fun main() {

    GiveMePassword().getPassword()

}