package com.example.algoritms.easy.longestCommonPrefix

/**
 *
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * */

class LongestCommonPrefix {

    fun findLongestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty())return ""
        var perfix = strs[0]
        for (i in 1..<perfix.length){
            for (j in 1..<strs.size){
                var s = strs[j].chars()
//                s[i] = perfix[i]
            }
        }

        return "perfix"
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