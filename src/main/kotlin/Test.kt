package org.example

fun main() {

    //Valid Address

    test(
        title = "When Address Is Valid ,Should Return True",
        result = addressChecker("17.2.33.0"),
        expectedResult = true,
    )
    test(
        title = "When Address Contains A Reserved address 0.0.0.0,Should Return True",
        result = addressChecker("0.0.0.0"),
        expectedResult = true,
    )

    //Invalid Address

    test(
        title = "When Address Contains A Segment Larger Than 255,Should Return False",//
        result = addressChecker("17.22.444.6"),
        expectedResult = false,
    )

    test(
        title = "When Address Contains A Segment Less Than Zero,Should Return False",
        result = addressChecker("2.-2.2.2"),
        expectedResult = false,
    )
    test(
        title = "When Address Contains A Segment with Leading Zero,Should Return False",
        result = addressChecker("03.2.6.4"),
        expectedResult = false,
    )
    test(
        title = "When Address Contains More Than 3 Dots,Should Return False",
        result = addressChecker("192.22.33.30.44)"),
        expectedResult = false,
    )
    test(
        title = "When Address Contains Less Than 3 Dots,Should Return False",
        result = addressChecker("23.23.23"),
        expectedResult = false,
    )
    test(
        title = "When Address Contains A Different Spliter,Should Return False",
        result = addressChecker("1,2.5.34"),
        expectedResult = false,
    )
    test(
        title = "When Address Contains A Character,Should Return False",
        result = addressChecker("1.2.A.34"),
        expectedResult = false,
    )
    test(
        title = "When Address Is Empty,Should Return False",
        result = addressChecker(""),
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