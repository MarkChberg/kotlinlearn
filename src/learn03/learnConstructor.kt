package learn03

fun main(args : Array<String>) {

}

open class ViewFather(val string : String)

// 如果不寫主構造函數，系統會默認提供空的構造函數
// 如果有父類，構造器也要顯式的調用父類的構造器，使用super即可
// 如果要調用本類的構造器，如下使用this的方式即可做到
open class ViewTwo : ViewFather{
    constructor(string : String) : this(string, 0) {
        /*todo something*/
    }
    constructor(string : String, int : Int) : super(string){
        /*todo something*/
    }
}