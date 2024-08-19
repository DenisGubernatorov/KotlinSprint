package lesson11

class Category(
    var id: Int,
    var name: String,
    var description: String,
    var image: String, // Опять для простоты ставлю стрингу
    var imgDescription: String, // Подставить если проблемы с картиной
    var items: MutableList<Recipe>,
) {
    fun addItem(item: Recipe) {
        // Реализация добавления рецепта в категорию.
    }

    fun removeItem(item: Recipe) {
        // Реализация удаления рецепта из категории
    }
}

class Recipe(
    var id: Int,
    var name: String,
    var description: String,
    var image: String, // Опять для простоты ставлю стрингу
    var imgDescription: String, // Подставить если проблемы с картиной
    var isFavorite: Boolean,
    var ingredients: MutableList<Ingredient>,
    /*
    Судя по макету, экран рецепта может быть как со способом приготовления, так и без него. Поэтому добавляю опционально
     */
    var cookingMethod: MutableList<String>? = null,
) {
    fun getRecipeView(servingCount: Int = 1) {
        /* Получение представления или вывод списка ингредиентов и необходимого количества, с учетом количества порций, используя свойства класса Ingredient
         measurementUnitPerItem и measurementUnitDescription*/
    }

    fun getCookingMethod() {
        /*
        Получение представления или вывод метода приготовления. Если cookingMethod == null, то ничего не делать
         */
    }
}

/*
Если честно, то не совсем понимаю зачем нужен класс ингредиента. Это в каждом рецепте, для каждого ингредиента,
создавать свой объект. Не во всех же рецептах ингредиенты повторяются. Плюс, для каждого рецепта может быть разное количество ингредиента необходимое
для приготовления одной порции (measurementUnitPerItem). Т.е. взять уже существующий объект класса Ingredient не получится.
Придется создавать новый, с таким же именем, описанием, но разными id и measurementUnitPerItem.
 Я бы в Recipe, вместо var ingredients: MutableList<Ingredient>, который так объявил потому, что нужно использовать отдельный класс ингредиента,
сделал бы вложенную мапу типа Map<String, Map<Int, String>>. Ключ внешней карты - это название ингредиента. Ключ вложенной мапы это
необходимое количество для приготовления одной порции, а значение это единицы измерения. В методе getRecipeView у класса Recipe
можно спокойно все обойти и вывести с учетом количества порций. И не создавал бы класс Ingredient.
 */
class Ingredient(
    var id: Int,
    var name: String,
    /*
     Количество единиц ингредиента в одном экземпляре класса. Будет использоваться для расчета количества ингредиента
     на выбранное количество порций
     */
    var measurementUnitPerItem: Int,
    // Единицы измерения (шт, гр, мл и т.д.)
    var measurementUnitDescription: String,
)

