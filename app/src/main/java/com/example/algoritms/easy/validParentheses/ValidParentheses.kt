package com.example.algoritms.easy.validParentheses

class ValidParentheses {
    fun isValid(s: String): Boolean {

        return true
    }
    
}

fun main() {
    val validator = ValidParentheses()

    // Test examples
    val testCases = listOf(
        "()" to true,
        "()[]{}" to true,
        "(]" to false,
        "([)]" to false,
        "{[]}" to true,
        "" to true,
        "{" to false,
        "}" to false,
        "({[({[()]})]})" to true,
        "({[({[([)]]})]})" to false
    )

    for ((input, expected) in testCases) {
        val result = validator.isValid(input)
        println("Input: \"$input\" - Expected: $expected, Result: $result")
    }
}
