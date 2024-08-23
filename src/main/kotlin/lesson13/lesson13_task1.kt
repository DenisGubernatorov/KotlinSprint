package lesson13

class PhoneDirectory(
    val name: String,
    val phone: Long,
    val companyName: String?,
) {
    fun showNumberInfo() {
        println("Имя: $name \nНомер: $phone\nКомпания: ${companyName ?: "<не указано>"}")
    }
}

fun main() {
    val phonesList =
        mutableListOf(
            PhoneDirectory(
                "John1",
                89123456789,
                null,
            ),
            PhoneDirectory(
                "John2",
                89123456799,
                null,
            ),
            PhoneDirectory(
                "John3",
                89123456999,
                "null",
            ),
            PhoneDirectory(
                "John4",
                89123459999,
                "companyName1",
            ),
            PhoneDirectory(
                "John5",
                89123499999,
                "companyName2",
            ),
        )
    println(phonesList.filter { it.companyName != null }.map { it.companyName })
}
