package learn08

fun main(args:Array<String>) {
    val point1 = Point(1, 4)
    val point2 = Point(3, 5)
    println("num plus : ${point1 + point2}")
    println("num times : ${point1 * 2}") // 不支持交換性，1.5 * point1就會失效，除非添加拓展函數
    println(point1 >= point2)
}

data class Point(var x : Int, var y : Int) : Comparable<Point> {

    val distant = x*x + y*y

    // 實現比較接口的類 可以直接轉成 運算符比較
    override fun compareTo(other: Point): Int {
        return compareValuesBy(this, other, Point::distant)
    }

    // 前面加operator，後面定義plus方法（此為約定，實際是調用了方法）
    operator fun plus(other : Point) : Point {
        return Point(x + other.x, y + other.y)
    }

    // 同樣的可重載運算符如下 minus(-), times(*), div(/), mod(%),
    operator fun minus(other: Point) : Point {
        return Point(x - other.x, y - other.y)
    }

    operator fun times(times : Int) : Point {
        return Point(x * times, y * times)
    }

    // plusAssign minusAssign 代表 += 和 -=

    // 一元運算符也可以重載 有unaryMinus(-), unaryPlus(+) , not(!), inc(++), dec(--) kotlin支持自動的前++和后++
    operator fun unaryMinus() : Point {
        return Point(-x, -y)
    }

    // a == b -------> a?.equals(b) ?: (b == null)
    override fun equals(other: Any?): Boolean { // equals不能被作為拓展函數
        if (this === other) return true // 三個等號是恆等表達式，表示同一個引用，與java中的==是一樣的，此運算符不能被重載
        if (other !is Point) return false
        return other.x == x && other.y == y // 這裡自動的轉型成了Point
    }


    override fun toString(): String {
        return "($x,$y)"
    }
}
