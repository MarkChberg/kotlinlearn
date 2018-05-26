package learn03

fun main(args : Array<String>) {

}

// 接口的定義和java一樣，默認是public的
interface Clickable {
    fun click()
    fun descInfo() = "this is Clickable interface" // 這個相當於java8中的default方法
}

interface Focusable {
    fun setFocus()
    fun descInfo() = "this is Focusable interface"
}
// 繼承會使用冒號 代替了繼承和實現
class Button : Clickable {
    // 重寫和java一樣，override不再是註解
    override fun click() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class ButtonTwo : Clickable, Focusable {
    override fun setFocus() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun descInfo(): String {
        // 此處父類默認方法均不會使用，必須重寫
        // 可以調用父類的方法，和java不同的是調用的形式變成了super<Xxx>.
        super<Clickable>.descInfo()
        super<Clickable>.descInfo()
        println()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun click() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}