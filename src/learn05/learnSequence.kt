package learn05

fun main (args : Array<String>) {
    val list = listOf("marl", "lily", "hello")
    val l = list.asSequence().filter { it.length == 4 }.toList() // 類似于java 的stream操作，與直接的集合操作不同，序列操作不會創建中間集合，相對效率高
    print(l)


    // 創建序列
    val generateSequence = generateSequence(0) { it + 1 }
    val takeWhile = generateSequence.takeWhile { it <= 100 }  // 以上兩個函數都是創建一個序列
    println(takeWhile.sum()) // 序列為惰性操作，只有計算結果時才會操作
}