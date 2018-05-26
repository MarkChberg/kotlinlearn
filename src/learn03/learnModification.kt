package learn03


// kotlin中的修飾符和java中類似，默認是public修飾，取消package修飾，protected修飾變得只有子類和本類可以訪問
// 新增internal修飾，表示模塊內可見
fun main(args : Array<String>) {

}

// 允許在頂層使用private，表示在文件中可見，也可以使用在類和方法上
private val wechat_number = "re_mark"

class A {
    private var desc = "hello , this means it is visible in this class"
}