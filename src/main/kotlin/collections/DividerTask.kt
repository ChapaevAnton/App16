package collections
// TODO: 25.04.2021 16.3.3

fun main() {

    println(DividerTask().divideToPrint("Builder"))
    println(DividerTask().divideToPrint("Worker"))


}

class DividerTask {

    private val listPerson = listOf(
        Person("Ann", "Builder"),
        Person("Bob", "Worker"),
        Person("Judy", "Builder"),
        Person("Doris", "Worker"),
        Person("Tommy", "Worker"),
        Person("Jim", "Builder"),
        Person("Sam", "Worker"),
        Person("Colin", "Builder"),
        Person("Connor", "Worker"),
        Person("Vick", "Builder"),
        Person("Polly", "Worker"),
        Person("Angela", "Builder")
    )

    fun divideToPrint(profession: String): MutableList<Person>? {
        return listPerson.groupByTo(mutableMapOf()) { it.profession }[profession]
    }
}


data class Person(val name: String, val profession: String)

