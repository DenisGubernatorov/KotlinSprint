package lesson21

fun main() {
    val skills =
        mutableMapOf(
            "Skill_1" to 40,
            "Skill_2" to 90,
            "Skill_3" to 70,
        )

    fun MutableMap<String, Int>.maxCategory(): String? = maxByOrNull { it.value }?.key
    println(skills.maxCategory())
}
