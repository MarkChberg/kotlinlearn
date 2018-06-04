package learn06

fun main(args : Array<String>) {

}

class MyService {
    fun performAction() = "foo"
}

class MyTest {
    private lateinit var myService: MyService // lateinit 表示延迟初始化属性，必须是var，因为需要在外部初始化

    fun setUp() {
        myService = MyService()
    }

    fun testAction()
            = myService?.performAction()
}