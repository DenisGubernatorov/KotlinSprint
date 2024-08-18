package lesson11

class User(
    var id: Int,
    var login: String,
    var password: String,
    var email: String,
)

fun main() {
    val userOne = User(1, "user1", "pass1", "usr1@mail.ru")
    val userTwo = User(2, "user2", "pass2", "usr2@mail.ru")

    showInfo(userOne)
    showInfo(userTwo)
}

private fun showInfo(user: User) {
    println(
        """Пользователь: 
             id: ${user.id}
             login: ${user.login}
             password: ${user.password}
             email: ${user.email}            
    """,
    )
}
