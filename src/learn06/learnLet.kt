package learn06

fun main(args : Array<String>) {
    val email : String? = ""
    // sendEmail(email) 此处无法将可空变量传递给非空变量，如果需要使用，可以用let函数
    if (email != null) sendEmail(email) // 这种形式是允许的，可用
    email?.let { sendEmail(it) } // 这种形式更符合kotlin的习惯，如果email是null，不会发生什么操作，如果email不是null，则调用函数
    // let里的拉姆达表达式接受一个参数，即调用者的参数，根据拉姆达表达式原理，可以简单替换为it
}

fun sendEmail(email : String) {

}