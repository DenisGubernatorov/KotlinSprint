package lesson13

class PhoneDirectoryThree(
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
            PhoneDirectoryThree(
                "John1",
                89123456789,
                null,
            ),
            PhoneDirectoryThree(
                "John2",
                89123456799,
                null,
            ),
            PhoneDirectoryThree(
                "John3",
                89123456999,
                "null",
            ),
            PhoneDirectoryThree(
                "John4",
                89123459999,
                "companyName1",
            ),
            PhoneDirectoryThree(
                "John5",
                89123499999,
                "companyName2",
            ),
        )
    println(phonesList.filter { it.companyName != null }.map { it.companyName })
}
