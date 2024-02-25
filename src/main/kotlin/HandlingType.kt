fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()
    println("number1 = ${number1}")

    val number3 = 3
    val number4 = 5
    val result = number3 / number4.toDouble()
    println("result = ${result}")

    val number5: Int? = 3
    val number6: Long = number5?.toLong() ?: 0L
    println("number6 = ${number6}")

    printAgeIfPerson(Person(20, "yeopKing"))
    printAgeIfPerson2(null)
}

fun printAgeIfPerson(obj: Any) {
    if (obj !is Person) {
        println("obj is not person tpye")
    } else {
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age )
}

