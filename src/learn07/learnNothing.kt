package learn07

fun main(args : Array<String>) {
    val noResultProcessor : NoResultProcessor? = null
    noResultProcessor?.process() ?: fail()
}

// Nothing返回类型表示这个方法永远不会正常结束
fun fail() : Nothing = throw IllegalArgumentException("fail forever")