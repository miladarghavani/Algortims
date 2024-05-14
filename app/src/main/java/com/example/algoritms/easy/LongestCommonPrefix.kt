package com.example.algoritms.easy

class LongestCommonPrefix {

    fun findLongestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }

        var prefix = strs[0]
        for (i in 1 until strs.size) {
            while (strs[i].length < prefix.length && !strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length - 1)
                if (prefix.isEmpty()) {
                    return ""
                }
            }
        }

        return prefix
    }
}

fun main() {
    val longestCommonPrefix = LongestCommonPrefix()

    // Example 1:
    val strs1 = arrayOf("flower", "flow", "flight")
    val answer1 = longestCommonPrefix.findLongestCommonPrefix(strs1)
    println("Example 1: Input - ${strs1.contentToString()}, Longest Common Prefix: $answer1")

    // Example 2:
    val strs2 = arrayOf("dog", "racecar", "car")
    val answer2 = longestCommonPrefix.findLongestCommonPrefix(strs2)
    println("Example 2: Input - ${strs2.contentToString()}, Longest Common Prefix: $answer2")

    // More Test Cases (add your own as well):
    val strs3 = arrayOf("apple", "ape", "april")
    val answer3 = longestCommonPrefix.findLongestCommonPrefix(strs3)
    println("Test Case 3: Input - ${strs3.contentToString()}, Longest Common Prefix: $answer3")

    val strs4 = arrayOf("") // Empty string
    val answer4 = longestCommonPrefix.findLongestCommonPrefix(strs4)
    println("Test Case 4: Input - ${strs4.contentToString()}, Longest Common Prefix: $answer4")

    val strs5 = arrayOf("a") // Single element array
    val answer5 = longestCommonPrefix.findLongestCommonPrefix(strs5)
    println("Test Case 5: Input - ${strs5.contentToString()}, Longest Common Prefix: $answer5")
}