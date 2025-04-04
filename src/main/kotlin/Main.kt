package org.example
fun main () {

}

fun addressChecker(address: String, dot: Char = '.'): Boolean {
    val result = mutableListOf<String>()
    var segment = StringBuilder()

    // Splits The Address Into Segments
    for (number in address) {
        if (number != '.' && number.isDigit().not()) return false
        if (number == dot) {
            result.add(segment.toString())
            segment = StringBuilder()
        } else {
            segment.append(number)
        }
    }
    // Add The Last Item In The Segment That Is Not Followed by dot

    result.add(segment.toString())

    // Loops The result Of Appending Segments Together

    for (item in result) {
        if (result.size != 4) return false
        if (item.toInt() !in 0..255) return false
        if (item.startsWith("0") && item != "0") return false
    }
    return true
}
