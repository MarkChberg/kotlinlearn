package learn08

fun main(args : Array<String>) {
    val p = Point(20,30)
    val s = Point(0, 0)
    println(p in s)
    print(p[0])
}

// 可以通過方括號來調用這個get方法，入參不一定要設置成int
operator fun Point.get(index : Int) : Int {
    return when(index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException()
    }
}

// 可以像數組一樣賦值
operator fun Point.set(index: Int, value : Int) {
    when(index) {
        0 -> x = value
        1 -> y = value
        else -> throw IllegalArgumentException()
    }
}

// 可以調用in運算符，直接即為調用此方法
operator fun Point.contains(other : Point) : Boolean {
    return this.distant <= other.distant
}

// 常用的即以上


// kotlin同樣支持..運算符，和for中的iterator約定，此處不再贅述