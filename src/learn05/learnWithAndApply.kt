package learn05

fun main(args : Array<String>) {
    print(generateAlphabet())
}

// 構建字母表初始寫法
fun generateAlphabet() : String {
    val result = StringBuilder("")
    for(letter : Char in 'a'..'z') {
        result.append(letter).append(" ")
    }
    result.append("\n i know that")
    return result.toString()
}

// 可以使用with改寫（帶有接收者的lambda表達式，之後會拓展深入）
fun generateAlphabet2() = //with也是表達式，可以直接用等號
        with(StringBuilder("")) { // with的第一個參數是會傳給第二個參數（即拉姆達）
        for(letter : Char in 'a'..'z') {
            this.append(letter).append(" ") // 這裡的this就是StringBuilder實例，
        }
        this.append("\n i know that")
    }.toString() // 調用同一個對象的多個方法會考慮使用

fun generateAlphabet3() = StringBuilder().apply {  // apply會將應用者作為參數傳遞給lambda
    for(letter in 'a'..'z') {
        this.append(letter).append(" ")
    }
    this.append("\n" +
            " i know that")
}.toString() // 構建者模式的時候考慮使用
