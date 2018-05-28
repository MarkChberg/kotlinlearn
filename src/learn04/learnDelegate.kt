package learn04

fun main(args : Array<String>) {

}


// 委託類，可以採用委託模式對類進行拓展（類持有一個被委託對象的引用）
// 通過下列代碼，可以很簡單的構建委託類，將方法轉發到實現上
// 注意： 以下實現必須基於一個接口，是將接口的實現委託給內部持有的對象
class MyDelegateList<T> (
    private val innerList : Collection<T> = ArrayList()) : Collection<T> by innerList