package lesson13

class PhoneDirectoryFour(
private val name: String,
private val phone: Long,
private val companyName: String?,
) {
    fun showNumberInfo() {
        println("Имя: $name \nНомер: $phone\nКомпания: ${companyName ?: "<не указано>"}")
    }
}

fun main() {
    val phoneList = mutableListOf<PhoneDirectoryFour>()

    while (true) {
        val phone = getInputVal("номер телефона").toLongOrNull()

        if (phone != null) {
            val name = getInputVal("имя")
            val companyName = getInputVal("имя компании").takeIf { it.isNotBlank() }
            // Странно что тут идешка ругается на "Smart cast to kotlin.Long (for null call)" для phone. Хотя здесь
            // гарантированно не null. Почему так?
            phoneList.add(PhoneDirectoryFour(name, phone, companyName))
        } else {
            println("Не задан или не правильный формат номера телефона. Невозможно добавить в справочник")
        }

        print("Хотите продолжить ввод (Д/Н)")
        if ("Д".lowercase() != readln().lowercase()) break
    }

    println()
    phoneList.map {
        it.showNumberInfo()
        println("----//----")
    }
}

fun getInputVal(description: String): String {
    print("Введите $description: ")
    return readln()
}
