package learn05

/*拉姆達本質上就是一段可以傳遞給其他函數的代碼*/
fun main(args : Array<String>) {
    val persons = listOf(Person("mark", 26), Person("lily", 23))
    /*此方法可以找到符合條件的最大值
    * it是簡略的寫法，表示的是應用的對象
    * lambda表達式的通用寫法是 {參數 -> 函數體} 始終在花括號內
    * */
    val maxBy = persons.maxBy(Person::age) // 如果lambda表達式是函數的最後一個參數，可以放在括號外，而如果是唯一的參數，可以省略括號
    println(maxBy)

    /*可以將lambda表達式存儲在一個變量中，而這個變量可以當成普通函數對待*/
    val sum = {x : Int, y : Int -> x + y}
    println(sum(1, 2))

    val joinToString = persons.joinToString(separator = " ", transform = Person::name) // 方法引用不能再{}里
    println(joinToString)

    val sum2 = {
        x : Int, y : Int
        ->
        println("參數$x 參數$y")
        x + y
    } // 方法體可以多句話

    println(sum2(5,6))
}

data class Person(val name : String, val age : Int)

