/*3174. CLEAR DIGITS*/


fun removeDigits(s: String): String {

    return ""
}

fun main() {
    // Test cases
    val test1 = "abc"
    val result1 = removeDigits(test1)
    println("Input: \"$test1\" => Output: \"$result1\"")  // Expected Output: "abc"

    val test2 = "cb34"
    val result2 = removeDigits(test2)
    println("Input: \"$test2\" => Output: \"$result2\"")  // Expected Output: ""

    val test3 = "a1b2c3d4"
    val result3 = removeDigits(test3)
    println("Input: \"$test3\" => Output: \"$result3\"")  // Expected Output: "cd"

    val test4 = "1234"
    val result4 = removeDigits(test4)
    println("Input: \"$test4\" => Output: \"$result4\"")  // Expected Output: ""

    val test5 = "ab12cd34ef56"
    val result5 = removeDigits(test5)
    println("Input: \"$test5\" => Output: \"$result5\"")  // Expected Output: "f"

    val test6 = "a2b4c6d8"
    val result6 = removeDigits(test6)
    println("Input: \"$test6\" => Output: \"$result6\"")  // Expected Output: ""
}

