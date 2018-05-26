package learn03

fun main(args : Array<String>) {

}

// 正常模式
class User(val id : Int, val name : String, val address : String) {
    fun saveUser(user : User) {
        if (user.name.isBlank()) {
            throw IllegalArgumentException("姓名不能為空")
        }
        if(user.address.isBlank()) {
            throw IllegalArgumentException("address can't be empty")
        }
    }
}

// 這裡使用局部函數的方式來構建驗證方法，可以提高代碼複用
class UserMod(val id : Int, val name : String, val address : String) {
    fun saveUser(user : User) {
        // 以下即為局部代碼
        fun validate(value : String) {
            if (value.isBlank()) {
                throw IllegalArgumentException("filed can't be empty")
            }
        }
        validate(name)
        validate(address)
    }
}

class UserMod2(val id : Int, val name : String, val address : String) {
    fun saveUser(user : User) {
        validateBeforeSave()
        // save code
    }
    // 也可以採取使用拓展函數的方法，在拓展函數里使用局部方法同樣有效，拓展函數不屬於類函數，但可以卸載類中
    fun UserMod2.validateBeforeSave() {
        fun validate(value : String) {
            if (value.isBlank()) {
                throw IllegalArgumentException("filed can't be empty")
            }
        }
        validate(name)
        validate(address)
    }
}



