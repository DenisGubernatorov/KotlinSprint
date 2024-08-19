package lesson11

fun main() {
    val marvin = Member(1, "marvinIcon", "Marvin", Status.MIC_OFF)
    val thinker = Member(2, "deepThoughtIcon", "Думатель", Status.BUSY)
    val members = mutableListOf(marvin, thinker)
    val musicChatRoom = ChatRoom("Rock", "Рок", members)

    musicChatRoom.addMember(Member(3, "jokerIcon", "Joker", Status.MUTED))
    musicChatRoom.setMemberStatus(marvin, Status.BUSY)
}

class ChatRoom(
    var icon: String, // Для простоты текстовое описание иконки. Типа не прогрузилась))
    var title: String,
    private var members: MutableList<Member>,
) {
    fun addMember(member: Member) {
        members.add(member)
    }

    fun removeMember(member: Member) {
        members.remove(member)
    }

    fun setMemberStatus(
        member: Member,
        status: Status,
    ) {
        // TODO реализовать, если не нашли такого участника
        members.firstOrNull { it.id == member.id }?.let { candidate -> candidate.status = status }
    }
}

class Member(
    var id: Int,
    var icon: String, // Для простоты текстовое описание иконки. Типа не прогрузилась))
    var name: String,
    var status: Status,
)

enum class Status(
    private val asText: String,
) {
    BUSY("Разговаривает"),
    MIC_OFF("Микрофон выключен"),
    MUTED("Пользователь заглушен"),
    ;

    // Ну тут уже когда работаем со статусами где-то в интерфейсе, то берем их getAsText для отображения
    fun getAsText() = asText
}
