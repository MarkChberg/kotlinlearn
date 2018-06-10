package learn07

fun main(array: Array<String>) {
    // 这里的类型是List<String?>
    val listCanHoldNull = listOf("fdf", "test", null)
    println(listCanHoldNull)
    // 此处用集合方法将其中包含的null值去除了
    val filterNotNull = listCanHoldNull.filterNotNull()
    println(filterNotNull)
    testArray()
}

fun differentCollection() {
    // 只读集合列表
    val listOf = listOf(1, 3, 5)
    // 可变集合列表
    val mutableList = mutableListOf(1, 2, 3)
    val arrayList = arrayListOf(1, 2, 4)

    // 只读
    val set = setOf(1, 3, 4)
    // 可变
    val mutableSet = mutableSetOf(1, 4, 5)
    hashSetOf(1,3)
    linkedSetOf(2)
    sortedSetOf(4)

    // 只读
    mapOf(2 to "two")
    // 可变
    mutableMapOf(1 to "one")
    hashMapOf(1 to "one")
    linkedMapOf(2 to "two")
    sortedMapOf(1 to "one")
}

fun testArray() {
    // kotlin中的Array是一个带有类型参数的类，元素被指定为相应的类型参数
    val letters = Array<String>(26) { i -> ('a' + i).toString()}    // lambda接受数组元素的下标
    println(letters.joinToString("_"))
}

fun testArray2() {
    val arrays = IntArray(5) {i -> i*i} // kotlin标准库提供类很多规定了类型的数组
    println(arrays)
    val filter = arrays.filter { i -> i % 2 == 0 } // 可以使用集合的方法（包含流方法），不过返回的不是数组是集合

}