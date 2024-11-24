package com.example.algoritms.easy.clearDigits


/*3174. CLEAR DIGITS*/



fun removeDigitsParham(s: String): String {
    return buildString {
        s.forEach {c ->
            if (c.isDigit())
                deleteAt(length - 1)
            else
                append(c)
        }
    }
}
fun main() {
    PerformanceTester.measureExecution(1000 , {removeDigitsParham("s")})
    // Test cases
    val test1 = "abc"
    val result1 = removeDigits(test1)
    println("Input: \"$test1\" => Output: \"$result1\"")  // Expected Output: "abc"

    val test2 = "cb34"
    val result2 = removeDigits(test2)
    println("Input: \"$test2\" => Output: \"$result2\"")  // Expected Output: ""

    val test3 = "a1b2c3d4"
    val result3 = removeDigits(test3)
    println("Input: \"$test3\" => Output: \"$result3\"")  // Expected Output: ""

    val test4 = "1234"
    val result4 = removeDigits(test4)
    println("Input: \"$test4\" => Output: \"$result4\"")  // Expected Output: ""

    val test5 = "ab12cd34ef56"
    val result5 = removeDigits(test5)
    println("Input: \"$test5\" => Output: \"$result5\"")  // Expected Output: ""

    val test6 = "a2b4c6d8"
    val result6 = removeDigits(test6)
    println("Input: \"$test6\" => Output: \"$result6\"")  // Expected Output: ""
}



fun removeDigits(s: String): String {
    val char = s.toMutableList()
    var i = 0
    while (true) {
        if (i == 0 && char[i].isDigit()) {
            char.removeAt(0)
        }
        if (i > 0 && char[i].isDigit()) {
            char.removeAt(i)
            char.removeAt(i - 1)
            i -= 1
        } else {
            i += 1
        }
        if (i >= char.size) {
            var s = StringBuilder()
            char.forEach {
                s.append(it)
            }
            return s.toString()
        }
    }
}