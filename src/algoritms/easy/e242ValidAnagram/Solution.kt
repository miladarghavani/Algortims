package com.example.algoritms.easy.e242ValidAnagram

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val countMap = IntArray(26)

        for (i in s.indices) {
            countMap[s[i] - 'a']++
            countMap[t[i] - 'a']--
        }

        for (count in countMap) {
            if (count != 0) return false
        }

        return true
    }
}
