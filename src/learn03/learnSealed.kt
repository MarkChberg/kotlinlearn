package learn03

fun main(args : Array<String>) {

}

// sealed是kotlin的新關鍵字，它可以如同枚舉一樣封裝內部類，到when的時候就不用使用else語句
// 必須採用內部類的形式，並且不能將class聲明為data
// sealed後面不能跟interface
sealed class Expr {
    class Sum : Expr() // 由於Expr是類，會使用到默認構造方法，所以後面得加括號，如果是接口則不用
    class Num : Expr()
}