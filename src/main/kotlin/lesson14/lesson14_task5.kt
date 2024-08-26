package lesson14

class Chat {
    companion object {
        private var messageId: Int = 0

        fun getNextId(): Int = messageId++
    }

    private val messages = mutableListOf<Message>()

    fun addMessage(
        messageText: String,
        author: String,
    ) {
        messages.add(Message(messageText, author, getNextId()))
    }

    fun addThreadMessage(
        text: String,
        author: String,
        parentMessageId: Int,
    ) {
        messages.add(ChildMessage(text, author, getNextId(), parentMessageId))
    }

    fun printChat() {
        val parenIds = messages.filterIsInstance<ChildMessage>().groupBy { it.parentMessageId }
        messages.forEach { it ->
            if (it !is ChildMessage) {
                println("Author ${it.author}: ${it.text}")
                if (parenIds.containsKey(it.id)) {
                    val childMessages = parenIds[it.id]
                    childMessages?.forEach {
                        println("\tAuthor ${it.author}: ${it.text}")
                    }
                }
            }
        }
    }

    private open class Message(
        val text: String,
        val author: String,
        val id: Int,
    )

    private class ChildMessage(
        text: String,
        author: String,
        id: Int,
        val parentMessageId: Int,
    ) : Message(text, author, id)
}

fun main() {
    val chat = Chat()
    chat.addMessage("simple", "me1")
    chat.addMessage("simple2", "me2")
    chat.addThreadMessage("answer1", "me1", 0)
    chat.addThreadMessage("answer2", "me2", 0)
    chat.printChat()
}
