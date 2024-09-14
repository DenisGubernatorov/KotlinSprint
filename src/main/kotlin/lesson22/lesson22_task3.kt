package lesson22

data class DataExample(
    val field1: String,
    val field2: Int,
    val field3: Boolean,
)

fun main() {
    val dataExample = DataExample("str", 1, true)
    val (fieldStr, fieldInt, fieldBoolean) = dataExample
    println("$fieldStr $fieldInt $fieldBoolean")
}
