fun main() {
    val str: String? = "ABC"
//    println(str.length); //Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

//    val length = str?.length ?: 0
//    println(length);

//    println(kotlinStartsWith(null))

}

fun kotlinStartsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null come in")
}

fun kotlinStartsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun kotlinStartsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun kotlinStartsWith(str: String?): Boolean {
    return str!!.startsWith("A") ?: false
}

/**
 * 아래는 자바스럽게 짠 코드
 */

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null come in")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

