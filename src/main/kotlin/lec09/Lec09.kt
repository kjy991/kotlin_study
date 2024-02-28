package lec09


fun main() {
    val person = Person("김준엽", 34)
    println("person.name = ${person.name}")
    person.age = 30

    println("person.age = ${person.age}")
    val person2 = Person("김준엽 주니어")
    println("person = ${person2}")
}

class Person(
    val name: String,
    var age: Int = 1
) {
    val uppercaseName: String
        get() = this.name.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean
        get() = this.age > 20


    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }

}