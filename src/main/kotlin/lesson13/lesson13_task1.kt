package lesson13

class PhoneDictionary(
    val name: String,
    val phone: Long,
    val companyName: String?,
)

fun main() {
    // Тестовый объект. Убеждаемся, что конструктор может принимать null в качестве имени компании
    val phoneDictionary = PhoneDictionary("John", 89, null)

}
