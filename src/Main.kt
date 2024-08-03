
fun main() {
    val ratings = mutableListOf<Pair<String, Int>>() // Список для хранения пар (название кафе, рейтинг)

    ratings.add(getCafeRating())
    ratings.add(getCafeRating())
    ratings.add(getCafeRating())

    println("Сравнение рейтинга:")
    val sortedRatings = ratings.sortedByDescending { it.second }


    for ((cafeName, rating) in sortedRatings) {
        println("Кафе: $cafeName, Средний рейтинг: $rating")
    }
}

fun getCafeRating(): Pair<String, Int> {
    var ozenka1: Int? = null
    var ozenka2: Int? = null
    var ozenka3: Int? = null
    var cafeName: String? = null

    println("Введите название кафе:")
    cafeName = readLine()

    println("Оценка 1 пользователя по 10-бальной шкале:")
    do {
        ozenka1 = readln().toIntOrNull()
    } while (ozenka1 == null)

    println("Оценка 2 пользователя по 10-бальной шкале:")
    do {
        ozenka2 = readln().toIntOrNull()
    } while (ozenka2 == null)

    println("Оценка 3 пользователя по 10-бальной шкале:")
    do {
        ozenka3 = readln().toIntOrNull()
    } while (ozenka3 == null)

    val summarOzenka = ozenka1 + ozenka2 + ozenka3
    val reiting: Int = summarOzenka / 3

    println("Вы ввели оценки: $ozenka1, $ozenka2, $ozenka3")
    println("Средняя оценка кафе '$cafeName': $reiting")

    return Pair(cafeName ?: "хуй пизда сковорада", reiting)
}