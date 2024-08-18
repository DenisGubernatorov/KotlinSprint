package lesson11

private class User2(
    var id: Int,
    var login: String,
    private var password: String, // ограничиваем получение пароля
    var email: String,
    var bio: String? = null,
) {
    fun showUserInfo() {
        println(
            """Пользователь $login: 
             id: $id             
             password: $password
             email: $email
             о себе: $bio
    """,
        )
    }

    fun setBio() {
        print("О себе(введите текст): ")
        bio = readln()
    }

    fun setPassword() {
        print("Для изменения пароля введите старый пароль: ")
        if (password == readln()) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль успешно изменен")
        } else {
            println("Неверный пароль")
        }
    }
}

fun main() {
    val user = User2(1, "login", "password", "usermail@mail.ru")

    user.setBio()
    user.setPassword()
    user.showUserInfo()
}
