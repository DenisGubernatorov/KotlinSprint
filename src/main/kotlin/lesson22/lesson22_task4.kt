package lesson22

class MainScreenViewModel {
    private var mainScreenState: MainScreenState =
        MainScreenState(
            data = "",
            isLoading = false,
        )

    data class MainScreenState(
        val data: String,
        val isLoading: Boolean = false,
    )

    fun loadData() {
        println("Загрузка данных")
        mainScreenState = mainScreenState.copy(data = "", isLoading = true)
        Thread.sleep(5000)
        println("Данные загружены")
        mainScreenState = mainScreenState.copy(data = "Какие-то загруженные данные", isLoading = false)
    }

    fun showState() {
        println(
            "Данные: ${
                mainScreenState.data.ifBlank { "Данные не загружены" }
            }",
        )
    }
}

fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.showState()
    mainScreenViewModel.loadData()
    mainScreenViewModel.showState()
}
