package learn03

import java.io.Serializable

fun main(args : Array<String>) {

}

interface State : Serializable

interface View {
    fun getCurrentState() : State

    fun restoreState(state: State) {}
}

class ButtonX : View {
    override fun getCurrentState(): State {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // 這種聲明內部類的方式類似于java中的靜態內部類，事實上和寫在外面沒有差別，不持有外部類的引用
    class ButtonStatu : State {
        fun printState() {
//            getCurrentStatus()
        }
    }
    // 如果加前綴inner，表示內部類（和java內部類一樣），持有外部類的引用
    inner class Inner() {
        fun printInner() {
            // 用此特殊的語法表示外部類的引用 this@Outter
            this@ButtonX.getCurrentState()
        }
    }
}