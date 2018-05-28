package learn04

fun main(args : Array<String>) {
    A.bar() // 這裡的調用使用了一種類似于java中靜態方法的調用

    // object：的這種形式還可以作為匿名內部類的寫法（當然，這裡的接口只有一個方法，可以用拉姆達表達式代替）
    object : Comparator<String> {
        override fun compare(o1: String?, o2: String?): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }
    // lambda
    val comparator = Comparator<String> { o1, o2 ->
        TODO("not implemented")
    }
}

class A {
    companion object { // 可以獲得直接通過容器類的名稱來訪問這個對象的方法和屬性的能力
        fun bar() {
            println("this is bar() invoked")
        }
    }
}

// 以下情況很適合用伴生類(即工廠模式，將構造器私有化，通過方法創建對象)
// 同樣，可以將對象的序列化和反序列化也放在伴生類中（伴生對象也可以實現接口，也可以作為拓展）
// 注意，只要聲明了主構造器，那麼創建就必須使用主構造
class Worker private constructor(val num : Int, val name : String, val age : Int) {
    // 在
    companion object {
        fun getInstance(num : Int, name : String, age : Int) = Worker(num, name, age)

        fun load() = ""
    }
}

// object還能寫匿名對象

