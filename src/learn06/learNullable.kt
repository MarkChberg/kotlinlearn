package learn06

fun main(args : Array<String>) {
    //len(null) 不被允许
    len2(null) // 可以被允许
}

/*java对null对处理一直是一个大的弊端，kotlin对可空类型做了显式的处理*/


fun len(string : String) = string.length // 这种情况下，编译器是无法通过传递一个null值的

fun len2(string: String?) // 在类型后面加上一个问号，表示可空
        = string?.length // ?. 是安全调用运算符，相当于一个分支 如果string是null，返回null，否则调用 多个安全调用可以一起使用


class Address(val street : String)

class Company(val address: Address)

fun getAddress(company: Company?)
    = company?.address?.street ?: "it is null replacement"// 可以使用链式调用
// ?: 是elvis运算符 当前一个是null的时候，会采用后面的默认值，否则返回前面

fun getStreet(company: Company?)
        = company?.address?.street ?: throw IllegalArgumentException("it can throw an exception") // elvis运算符是一个表达式，可以接throw



class Person(val firstName : String, val lastName : String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson =  other as? Person ?: return false // as?是一个安全转换，如果other不是Person类型的会返回null
        return otherPerson.firstName == firstName
                && otherPerson.lastName == lastName
    }
}

/*!!是非空断言，foo！======》 如果foo是null，抛出空指针异常，如果非null，返回foo*/
