package learn03

fun main(args : Array<String>) {

}

// 如果是在接口中定義了一個屬性，此屬性為抽象屬性，表示在子類中必須存在取得此nickName的方法
interface Student {
    val nickName : String

    val default_email : String
        get() = nickName + "@qq.com" // 如果在接口中就由默認實現，則可以被繼承
}

// 可以使用構造器的方式來得到nickName，注意使用override關鍵字
class PrivateStu(override val nickName: String) : Student

// 可以使用成員變量的形式來用get方法獲取參數（適合一些有對get方法進行特殊處理的形式）
class SubStu(val email : String) : Student {
    override val nickName: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

}