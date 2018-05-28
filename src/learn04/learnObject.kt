package learn04

fun main(args : Array<String>) {
      Student.print()
}


// 對象聲明 + 單例對象（不能有構造器，因為該對象在聲明的同時就已經創立了）
object Student {
    val number = 0
    val name = "wjt"

    fun print() {
        println("$name $number")
    }
}

// 有一種情形很適合用對象構建object，如下
data class Person(val name : String, val age : Int) {
    // 可以在一個使用類裡面嵌套一個object
    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int {
            return o1.age.compareTo(o2.age)
        }

    }
}

