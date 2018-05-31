package learn05

fun main(args : Array<String>) {
    val list = listOf("mark", "lily", "hello")
    val map = list.filter { it.length == 4 }.map(String::length) // 與java的用法類似
    println(map)

    val mapOf = mapOf(1 to "one", 2 to "two")
    val mapValues = mapOf.filterKeys { it == 1 }.mapValues { it.value.toUpperCase() } // 對map的操作增加了鍵值兩種類型
    println(mapValues)

    println(list.filter { it.length == 4 }.count()) // 聚合函數有count，any，find


    // groupBy 將 list轉換成一個分組的map
    println(list.groupBy(String::length))

    /*flatMap會將應用之後的元素全部放在同一個集合里*/
    val flatMap = list.flatMap(String::toList)
    println(flatMap)
}