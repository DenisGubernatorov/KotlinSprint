package lesson17

class Quiz(
    question: String,
    answer: String,
) {
    val question = question
        get() = field
    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quiz = Quiz("question", "answer")
    println(quiz.question)
    println(quiz.answer)
    quiz.answer = "new answer"
    println(quiz.answer)
}
