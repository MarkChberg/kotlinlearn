package learn03

import java.time.LocalDate
import java.util.*

fun main(args : Array<String>) {
    println(str)
}

/*三重引號和python的使用方法一樣，不過在kotlin中是雙引號*/
val str = """
    today is Weekend
    ${Date()}
    ${LocalDate.now()}
"""

val regex = ".".toRegex()

val split = "."

fun split(str : String, regex : Regex) = str.split(regex)