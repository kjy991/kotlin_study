import java.util.StringJoiner
import javax.print.DocFlavor.STRING

fun main() {
    forToKotlin()

}

private fun forToKotlin() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println("number = ${number}")
    }
    println("=================")
    for (i in 1..3) {
        println("i = ${i}")
    }
    println("=================")
    for (i in 3 downTo 1) {
        println("i = ${i}")
    }
    println("=================")
    for (i in 1..10 step 2) {
        println("i = ${i}")
    }
}

