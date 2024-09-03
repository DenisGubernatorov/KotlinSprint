package lesson17

class Directory(
    name: String,
    filesCount: Int,
    isSecret: Boolean,
) {
    var name = name
        get() = if (isSecret) "Скрытая папка. Количество файлов - 0 " else "Имя папки: $field Количество файлов: $filesCount "
    private var filesCount = filesCount
        get() = field
    var isSecret = isSecret
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val directory = Directory("dir", 10, true)
    println(directory.name)
    directory.isSecret = false
    println(directory.name)
}
