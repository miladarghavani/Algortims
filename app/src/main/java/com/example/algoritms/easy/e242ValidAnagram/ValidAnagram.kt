package com.example.algoritms.easy.e242ValidAnagram

class Solution1{
    fun isAnagram(s: String, t: String): Boolean {
        return false
    }
}

fun main() {
    val tests = listOf(
        Pair("anagram", "nagaram") to true,
        Pair("rat", "car") to false,
        Pair("listen", "silent") to true,
        Pair("hello", "ollhe") to true,
        Pair("a", "a") to true,
        Pair("a", "b") to false,
        Pair("schoolmaster", "theclassroom") to true,
        Pair("fluster", "restful") to true,
        Pair("dormitory", "dirtyroom") to true,
        Pair("conversation", "voicesranton") to true,
        Pair("elvis", "lives") to true,
        Pair("redecoration", "onecardtrio") to false,
        Pair("state", "taste") to true,
        Pair("theeyes", "theyse") to false,
        Pair("astronomer", "moonstarer") to true,
        Pair("night", "thing") to true,
        Pair("part", "trap") to true,
        Pair("debitcard", "badcredit") to true,
        Pair("elvis", "elvsi") to true,
        Pair("dusty", "study") to true
    )

    for ((input, expected) in tests) {
        val (s, t) = input
        val result = Solution().isAnagram(s, t)
        println("Input: s = \"$s\", t = \"$t\" => Output: $result (Expected: $expected)")
    }
}
