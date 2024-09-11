package lesson20

fun main() {
    val lambda: (str: String) -> String = { userName -> "С наступающим Новым Годом, $userName!" }
    println(lambda(readln()))
}
