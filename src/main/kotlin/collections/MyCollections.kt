package collections

// TODO: 24.04.2021 16.3
class MyCollections {

    val arrayList: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)
    val list: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 5, 5, 4, 3, 2, 4, 5, 7, 9)
    val sets: Set<Int> = list.toSet()


}

data class ItemMap(val str: String, val value: Int, val cls: Int)


fun main() {

    val coll = MyCollections()
    coll.arrayList.add(10)
    println(coll.arrayList)

    for (item in coll.list) {
        println(item)
    }

    for (index in coll.list.indices) {
        println("$index ${coll.list[index]}")
    }

    println(coll.sets)


    val itemMap1 = ItemMap("Honda", 100, 1)
    val itemMap2 = ItemMap("Lada", 200, 2)

    val map1: Map<Int, ItemMap> = mutableMapOf(1 to itemMap1, 2 to itemMap2)
    val map2: Map<String, Int> = mutableMapOf("str2" to 2)

    println(map2["str2"])
    print(map1)

    val list2: MutableList<Int> = mutableListOf()
    for (i in 0..20) {
        list2.add(i)
    }

    for (i in 0..20) {
        println("элемент-$i=${list2[i]}")
    }

    println(list2.getOrElse(21) { list2.lastIndex + 1 })
    println(list2.getOrNull(21) ?: list2.lastIndex + 1)

    val list3: MutableList<Int> = list2.filter { it % 2 == 0 }.toMutableList()
    println(list3)

    println(list3.drop(2))
    println(list3.dropLast(2))
    println(list3.dropWhile { it <= 10 })
    println(list3.dropLastWhile { it >= 10 })

    println(list3.take(5))
    println(list3.takeLast(5))
    println(list3.takeWhile { it <= 10 })
    println(list3.takeLastWhile { it >= 10 })

    list3[5] = 100
    println(list3.maxOrNull())
    println(list3.minOrNull())

    val list4: List<ItemMap> = listOf(itemMap1, itemMap2, ItemMap("Ford", 300, 1))

    println(list4.maxByOrNull { it.value })
    println(list4.maxWithOrNull { o1, o2 -> o1.str.length - o2.str.length } ?: "null")

    val map5: Map<Int, List<ItemMap>> = list4.groupBy { it.cls }
    val map6: Map<Int, List<ItemMap>> = list4.groupByTo(mutableMapOf()) { it.cls }

    println(map5)
    println(map6)

    val list5 = coll.list.distinct()
    println(list5)

    println(list4.distinctBy { it.cls })

    val list6 = list4.map {
        it.value + 20
    }

    println(list6)

    println(listOf(list5, list6).flatten())
    println(listOf(list5, list6).flatMap {
        it.reversed()
    })

    val list7 = mutableListOf(10,11,12)
    list7.fill(1)
    println(list7)


}


