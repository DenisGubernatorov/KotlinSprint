package lesson15

import kotlin.random.Random

val messages = mutableListOf<Message>()

interface SimplePrivilege {
    fun readMessages()

    fun writeMessage(text: String)
}

interface AdminPrivilege {
    fun removeMessage(message: Message)

    fun removeUser(user: User)
}

abstract class BaseUser(
    val userId: Int,
    val userName: String,
    val privilegeStatus: String,
) : SimplePrivilege {
    override fun readMessages() {
        println("$userName ($privilegeStatus) читает сообщения")
        messages.forEach {
            println("Сообщение ${it.messageId} от ${it.author.userName}: ${it.text} ")
        }
    }

    override fun writeMessage(text: String) {
        println("$userName ($privilegeStatus) пишет сообщение")
        messages.add(Message(text, Random.nextInt(1, 1000), this))
    }
}

class User(
    userId: Int,
    userName: String,
) : BaseUser(userId, userName, "Пользователь")

class Admin(
    userId: Int,
    userName: String,
) : BaseUser(userId, userName, "Админ"),
    AdminPrivilege {
    override fun removeMessage(message: Message) {
        println("$userName ($privilegeStatus) удаляет сообщение  ${message.messageId} от пользователя ${message.author.userName}")
    }

    override fun removeUser(user: User) {
        println("$userName ($privilegeStatus) удаляет пользователя ${user.userName}")
    }
}

class Message(
    val text: String,
    val messageId: Int,
    val author: BaseUser,
)

fun main() {
    val user = User(1, "user1")
    val user2 = User(2, "user2")
    val admin = Admin(3, "Admin")
    user.writeMessage("User message")
    user.readMessages()
    user2.writeMessage("User2 message")
    user2.readMessages()
    admin.readMessages()
    admin.writeMessage("Admin message")
    admin.removeMessage(messages.first())
    admin.removeUser(user)
}
