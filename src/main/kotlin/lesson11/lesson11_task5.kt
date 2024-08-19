package lesson11

class Forum(
    private val users: MutableList<User> = mutableListOf(),
    private val messages: MutableList<Message> = mutableListOf(),
) {
    fun createUser(userName: String): User {
        val id = (users.lastOrNull()?.userId ?: 0) + 1
        val user = User(id, userName)
        users.add(user)
        return user
    }

    fun createMessage(
        userId: Int,
        message: String,
    ) {
        users.find { it.userId == userId }?.let { messages.add(Message(userId, message)) }
            ?: run { println("Нет такого пользователя. Сообщение не добавлено") }
    }

    fun printThread() {
        // Красиво, но мне пока читать это еще трудней, чем писать)))
        messages.forEach { message -> println("${(users.find { message.authorId == it.userId })?.userName}:${message.message}") }
    }

    data class User(
        val userId: Int,
        val userName: String,
    )

    data class Message(
        val authorId: Int,
        val message: String,
    )
}

fun main() {
    val forum = Forum()
    val monkey1 = forum.createUser("Monkey1")
    val monkey2 = forum.createUser("Monkey2")
    // Создать то, из вне все равно можно. Но его сообщения не попадут в список сообщений.
    val user = Forum.User(3, "Marvin")

    forum.createMessage(monkey1.userId, "Hey!")
    forum.createMessage(monkey2.userId, "Ho!")
    forum.createMessage(monkey1.userId, "Beer?")
    forum.createMessage(monkey2.userId, "Two beer!!!")

    forum.printThread()
}
