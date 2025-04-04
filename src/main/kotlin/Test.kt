package org.example

fun main() {

    //Valid Address

    test(
        title = "When Address Is Valid",
        result = addressChecker("17.2.33.0"),
        expectedResult = true,
    )

    //Invalid Address

    test(
        title = "When Address Contains A Segment Larger Than 255",
        result = addressChecker("17.22.444.6"),
        expectedResult = false,
    )

    test(
        title = "When Address Contains A Segment Less Than Zero",
        result = addressChecker("2.-2.2.2"),
        expectedResult = false,
    )
    test(
        title = "When Address Contains A Segment Leading With Zero",
        result = addressChecker("03.2.6.4"),
        expectedResult = false,
    )
    test(
        title = "When Address Contains More Than 3 Dots",
        result = addressChecker("192.22.33.30.44)"),
        expectedResult = false,
    )
    test(
        title = "When Address Contains Less Than 3 Dots",
        result = addressChecker("23.23.23"),
        expectedResult = false,
    )
    test(
        title = "When Address Contains A Different Spliter ",
        result = addressChecker("1,2.5.34"),
        expectedResult = false,
    )
    test(
        title = "When Address Contains A Character",
        result = addressChecker("1.2.A.34"),
        expectedResult = false,
    )
    test(
        title = "When Address Contains A Reserved Segments 0.0.0.0",
        result = addressChecker("0.0.0.0"),
        expectedResult = false,
    )
}

fun test(title: String, result: Boolean, expectedResult: Boolean) {
    if (result == expectedResult) {
        println("Success_ $title")
    } else {
        println("Failed _ $title")
    }
}