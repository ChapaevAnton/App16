package collections

// TODO: 25.04.2021 16.3.5

fun main() {
    val lastNameDuplicates = LastNameDuplicates()

    lastNameDuplicates.thereCanBeOnlyOne()
}

class LastNameDuplicates {
    private val employeeList = listOf(
        Employee("Дмитрий", "Иванов", 76),
        Employee("Иван", "Петров", 22),
        Employee("Антон", "Сидоров", 24),
        Employee("Дмитрий", "Иваненко", 25),
        Employee("Дмитрий", "Иванов", 76),
        Employee("Алла", "Иванова", 21),
        Employee("Тамара", "Чернецкая", 43),
        Employee("Дмитрий", "Савушкин", 23),
        Employee("Петр", "Симакин", 43),
        Employee("Василий", "Иванов", 23),
        Employee("Соня", "Иванова", 54),
        Employee("Виктория", "Иванова", 64),
        Employee("Дарья", "Петрова", 23),
        Employee("Дмитрий", "Иванов", 76),
        Employee("Дмитрий", "Иванов", 76),
        Employee("Дмитрий", "Иванов", 76),
        Employee("Дмитрий", "Иванов", 76),
        Employee("Серафима", "Ивушкина", 18),
        Employee("Наталья", "Иванова", 60),
        Employee("Борис", "Иванов", 34),
        Employee("Алина", "Сидорова", 23),
        Employee("Дмитрий", "Иванов", 76)
    )

    fun thereCanBeOnlyOne() {
        val temp = employeeList.distinctBy{
            Selector(it.name,it.lastName,it.age)
        }
        println(employeeList.size)
        println(temp.size)
        println(temp)

    }
}

data class Employee(val name: String, val lastName: String, val age: Int)

data class Selector(val name: String, val lastName: String, val age: Int)