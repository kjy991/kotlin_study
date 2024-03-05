package lec15

fun main() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "A"
    oldMap[2] = "B"
    oldMap[3] = "C"
    for (mutableEntry in oldMap) {
        println("mutableEntry = ${mutableEntry}")
    }
    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }


}