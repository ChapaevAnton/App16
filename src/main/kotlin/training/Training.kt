package training


fun main(args: Array<String>) {
    val fruits = listOf(
        Fruit("Mellon", 3.4),
        Fruit("Water Mellon", 7.2),
        Fruit("Apple", 0.5)
    )
    val heaviestFruit = fruits.maxWithOrNull { fruit1, fruit2 ->
        when {
            fruit1.avgWeight > fruit2.avgWeight -> 1
            fruit1.avgWeight == fruit2.avgWeight -> 0
            else -> -1

        }
    }
    println(heaviestFruit)

    val fruitsTwo = listOf(
        FruitTwo("Mellon", 3.4, 20),
        FruitTwo("Water Mellon", 7.2, 10),
        FruitTwo("Apple", 0.5, 200)
    )
    val heaviestFruitTwo = fruitsTwo.minWithOrNull { fruit1, fruit2 ->
        when {
            fruit1.pricePerKg > fruit2.pricePerKg -> return@minWithOrNull 1
            fruit1.pricePerKg == fruit2.pricePerKg -> return@minWithOrNull 0
            else -> return@minWithOrNull -1
        }
    }
    println(heaviestFruitTwo)


    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val newList = list.map { it * it }
    val newList2 = newList.map { it.toDouble() }
    println(newList) //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
    println(newList2)

}

data class Fruit(
    val name: String,
    val avgWeight: Double
)


data class FruitTwo(
    val name: String,
    val avgWeight: Double,
    val pricePerKg: Int
)
