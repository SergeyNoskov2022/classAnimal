class Animal(
    name: String,
    age: Int
) {
    init {
        if (age > 6) {
            println("${name.uppercase()}")
        } else if (age > 0 && age <= 6) {
            println("${name.lowercase()}")
        }
    }
    constructor(name: String): this(name, -1) {
        println("$name")
    }
}

fun main() {
    Animal("Тузик", 8) // Ожидаемый вывод: ТУЗИК
    Animal("Мура", 3) // Ожидаемый вывод: мура
    Animal("мУхТаР") // Ожидаемый вывод: мУхТаР
}
