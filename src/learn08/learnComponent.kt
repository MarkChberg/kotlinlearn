package learn08

fun main(args : Array<String>) {
    val p = Point(10, 15)
    val (xpos, ypos) = p // 可以使用componentN的形式來進行解構聲明
    val map = mapOf(1 to "one", 2 to "two")
    for ((k, v) in map) { // 此處便用了結構聲明
        println("$k, $v")
    }
    println(xpos)
}

operator fun Point.component1() = x

operator fun Point.component2() = y


// 主要應用場景是在一個方法里返回多個值
data class NameComponents(val name : String, val extension : String)

fun splitNames(fullName : String) : NameComponents {
    val (name, extension) = fullName.split(".", limit = 2) //據源碼來看，N最大是5
    return NameComponents(name, extension)
}
