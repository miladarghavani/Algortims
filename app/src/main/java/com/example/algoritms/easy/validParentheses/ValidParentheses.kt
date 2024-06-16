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







/*
* // Map to hold the matching pairs
    private val matchingBracket = mapOf(')' to '(', ']' to '[', '}' to '{')

    fun isValid(s: String): Boolean {
        // Stack to keep track of opening brackets
        val stack = mutableListOf<Char>()

        for (char in s) {
            if (char in matchingBracket) {
                // If the current character is a closing bracket, check the top of the stack
                val topElement = if (stack.isNotEmpty()) stack.removeAt(stack.size - 1) else '#'
                if (matchingBracket[char] != topElement) {
                    return false
                }
            } else {
                // If it's an opening bracket, push it onto the stack
                stack.add(char)
            }
        }

        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty()
    }*/