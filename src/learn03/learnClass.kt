package learn03

fun main(args : Array<String>) {

}

// kotlin的類設計理念和java的不同，默認是final的，如果一個類需要被繼承，要顯式的使用open關鍵字
open class RichButton : Clickable {
    // 如果是改寫了接口的方法或者是open的方法，那麼它默認也是open的，如果不想要子類去改寫，需要顯式聲明為final
    final override fun click() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun diable() {}
    // 對於方法來說，kotlin默認也是final，如果需要暴露給子類重寫，需要手動將方法命名為open
    open fun animate() {}
}

// kotlin 同樣有abstract修飾符，abstract本身就是給子類實現的，不必再寫上open了
abstract class Animated {
    // 抽象方法沒有方法體，完全交由子類實現
    abstract fun animate()
    // open 方法可以提供一個默認的實現，但子類可以重寫
    open fun stopAnimate() {}
    // 普通方法為final
    fun animatedTwice() {}
}

class Test : Animated() {
    // 必須實現
    override fun animate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // 可以選擇實現或者是直接使用父類的方法
    override fun stopAnimate() {
        super.stopAnimate()
    }
}

