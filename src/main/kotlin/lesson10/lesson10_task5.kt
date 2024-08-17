package lesson10

private const val LOGIN = "login"
private const val PASSWORD = "password"
private val basket = listOf("Полотенце", "Путеводитель")
private const val TOKEN_LENGTH = 32

fun main() {
    print("Введите логин: ")
    val usrLogin = readln()
    print("Введите пароль: ")
    val usrPassword = readln()
    val generatedToken = getGeneratedToken(usrLogin, usrPassword)

    val basketItems = getBasketItems(generatedToken)

    println(
        if (basketItems == null) "Не удалось авторизоваться. Проверьте правильность логина или пароля" else "$basketItems",
    )
}

fun getBasketItems(generatedToken: String?): List<String>? = if (generatedToken == null) null else basket

fun getGeneratedToken(
    usrLogin: String,
    usrPassword: String,
): String? {
    if (usrLogin != LOGIN || usrPassword != PASSWORD) return null

    val possibleVals = ('A'..'Z') + ('a'..'z') + ('1'..'9')
    val tokenAsArray = CharArray(TOKEN_LENGTH)
    repeat(TOKEN_LENGTH) {
        tokenAsArray[it] = possibleVals.random()
    }
    tokenAsArray.shuffle()

    return String(tokenAsArray)
}
