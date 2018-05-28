package learn04

fun main(args : Array<String>) {
    val user = User()
    println(user.age)
    println(user.equals(User()))
    println(user.hashCode())
    val copy = user.copy()
    println(copy.age)
    user.age = 25
    println(copy.age) // 複製一個對象的方法
}


// 聲明一個數據封裝類（包含基本的方法，比如equals，toString，copy等）
data class User(var name : String = "", var age : Int = 0)