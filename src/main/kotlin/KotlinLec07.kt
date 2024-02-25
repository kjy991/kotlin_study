import java.util.StringJoiner
import javax.print.DocFlavor.STRING

fun main() {
    val parseIntOrThrow = parseIntOrThrow("12dㅇ3")
    println("parseIntOrThrow = ${parseIntOrThrow}")


}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: java.lang.NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 순자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        return str.toInt()
    } catch (e: java.lang.NumberFormatException) {
        null
    }
}
