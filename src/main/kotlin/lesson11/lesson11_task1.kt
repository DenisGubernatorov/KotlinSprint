package lesson11

class User(
    private var id: Int,
    private var login: String,
    private var password: String,
    private var email: String,
) {
    fun showUserInfo() {
        println(
            """Пользователь $login: 
             id: $id             
             password: $password
             email: $email            
    """,
        )
    }
}

fun main() {
    val userOne = User(1, "user1", "pass1", "usr1@mail.ru")
    val userTwo = User(2, "user2", "pass2", "usr2@mail.ru")

    userOne.showUserInfo()
    userTwo.showUserInfo()
}
