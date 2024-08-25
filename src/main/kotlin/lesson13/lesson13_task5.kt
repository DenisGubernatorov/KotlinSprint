package lesson13

class PhoneDirectoryFive(
    private val name: String,
    private val phone: Long,
    private val companyName: String?,
) {
    fun showNumberInfo() {
        println("Имя: $name \nНомер: $phone\nКомпания: ${companyName ?: "<не указано>"}")
    }
}

fun main() {
    val phoneNumber: Long = readPhoneNumber()
    println(phoneNumber)
}

private fun readPhoneNumber(): Long {
    return try {
        val strPhoneNum = readln()
        return strPhoneNum.toLong()
    } catch (e: NumberFormatException) {
        println(e.javaClass.simpleName)
        readPhoneNumber()
    }
}
