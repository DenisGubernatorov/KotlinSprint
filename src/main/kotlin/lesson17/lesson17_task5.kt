package lesson17

class User17(
    userLogin: String,
    userPassword: String,
) {
    var userLogin = userLogin
        set(value) {
            val oldVal = field
            field = value
            println("Логин \"$oldVal\" успешно изменен на \"$field\"")
        }
    var userPassword = userPassword
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() {

            return "*".repeat(field.length)
        }
}

fun main() {
    val user17 = User17("JustNiceLogin", "nicePassword")
    println(user17.userLogin)
    println(user17.userPassword)

    user17.userLogin = "Login"
    user17.userPassword = "NewPass"
}
