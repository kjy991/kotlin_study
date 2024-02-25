import java.util.StringJoiner
import javax.print.DocFlavor.STRING

fun validateScoreIsNotNegative(score: Int): Unit {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
    if (score !in 0..100) {
        throw IllegalArgumentException("socre의 범위는 0부터 100입니다")
    }
    if (score in 0..100) {
        println(score)
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        return "P"
    } else {
        return "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        return "A"
    } else if (score >= 80) {
        return "B"
    } else if (score >= 70) {
        return "C"
    } else {
        return "D"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        in 50..59 -> "E"
        else -> "F"
    }

//    return when (score / 10) {
//        9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        6 -> "D"
//        5 -> "E"
//        else -> "F"
//    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니")
        else -> println("1, 0, -1이 아닙니다.")
    }
}


fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}


