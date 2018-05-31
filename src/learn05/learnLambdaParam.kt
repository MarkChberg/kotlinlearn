package learn05

fun main (args : Array<String>) {
    val listOf = listOf("hello", "world")
    printMessageWithPrefix(listOf, ",")
    val maxBy = listOf.maxBy(String::length) // 方法引用
    println(maxBy)

    run (:: salute) // 可以用此方式引用頂層函數 ， 而構造函數的調用動作也可以使用 ：：
    val createAction = ::Person
    createAction("wjt", 36) // 調用了構造函數
}

fun printMessageWithPrefix(message : Collection<String>, prefix : String) {
    var test = 0
    message.forEach {
        println("$prefix $it") // 可以在lambda表達式里使用到函數參數
        test ++
        println(test) // 與java不同，kotlin可以在表達式中改變非final變量甚至修改他們
    }
    println(test)
}

val getAge = Person::age

val salute = { println("salute")}