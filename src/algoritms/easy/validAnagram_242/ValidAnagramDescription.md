package com.example.algoritms.easy.validAnagram_242

    242. Valid Anagram

https://leetcode.com/problems/valid-anagram/
    
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    
    Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true
    
    Example 2:
    Input: s = "rat", t = "car"
    Output: false
    
    Constraints:
    1 <= s.length, t.length <= 5 * 10^4
    s and t consist of lowercase English letters.
    
    Hint 1:
    Count the frequency of each character in both strings and compare the counts.
    
    Hint 2:
    Alternatively, sort both strings and compare them.
