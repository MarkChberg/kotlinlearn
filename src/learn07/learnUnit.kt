package learn07

fun main (array: Array<String>) {
    f()
}


// 此处省略了Unit返回值，此返回值类似与java中的void返回值，它与void不同的是它是一个完备的类型，可以写入泛型中
fun f() = {
    println("test unit")
}

interface Processor<T : Any?> {
    fun process() : T
}

class NoResultProcessor : Processor<Unit> {

    // 此时表明可以不用返回值
    override fun process() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}