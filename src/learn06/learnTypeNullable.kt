package learn06

fun main(args : Array<String>) {
    printHashCode(null)
    // printHashCode2(null) 无法执行
}

fun <T> printHashCode(t : T) { // 此处T被推导成了Any？ kotlin中所有泛型类和泛型函数的类型参数都是可空的
    println(t?.hashCode()) // 由此也可以看出默认是可空
}

fun <T : Any> printHashCode2(t : T) {
    println(t.hashCode()) // 如果如此声明，则表示有了非空上界
}