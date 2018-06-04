package learn06

fun main(args : Array<String>) {

}

fun verifyUserInput(input : String) {
    if (input.isNullOrBlank()) { // 此处不需要使用安全调用运算符，因为这个方法是可空类型的拓展方法，在方法内部使用了判断
        println("well")
    }
}

/*一般情况下，我们的拓展函数应该将其作为非空函数的拓展函数*/