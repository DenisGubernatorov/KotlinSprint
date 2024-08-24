package lesson13

class PhoneDirectory(
    private val name: String,
    private val phone: Long,
    private val companyName: String?,
) {
    fun showNumberInfo() {
        println("Имя: $name \nНомер: $phone\nКомпания: ${companyName ?: "<не указано>"}")
    }
}

fun main() {
    val phoneDirectory = PhoneDirectory("John", 89123456789, null)
    phoneDirectory.showNumberInfo()
}
