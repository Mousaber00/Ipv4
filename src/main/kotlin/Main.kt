package org.example
fun main () {

}

fun addressChecker(addrress: String, dot: Char = '.'): Boolean {
    val result = mutableListOf<String>()
    var segment = StringBuilder()

    // Check  If The Address Is Not Reserved
    if (addrress == "0.0.0.0") return false
// Splits The Address Into Segments
    for (number in addrress) {
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
    for (adress in result) {
        if (result.size != 4) return false
        if (adress.toInt() !in 0..255) return false
        if (adress.startsWith("0") && adress != "0") return false
    }
    return true
}
