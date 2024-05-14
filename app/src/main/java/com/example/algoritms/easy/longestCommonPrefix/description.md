package com.example.algoritms.easy.longestCommonPrefix

14-Longest Common Prefix

https://leetcode.com/problems/longest-common-prefix/description/


``` leetCode
  Write a function to find the longest common prefix string amongst an array of strings.
 
  If there is no common prefix, return an empty string "".
 
  Example 1:
 
  Input: strs = ["flower","flow","flight"]
  Output: "fl"
 
  Example 2:
 
  Input: strs = ["dog","racecar","car"]
  Output: ""
  Explanation: There is no common prefix among the input strings.
 
  Constraints:
 
      1 <= strs.length <= 200
      0 <= strs[i].length <= 200
      strs[i] consists of only lowercase English letters.
 ```

 ```guid
Consider the following:

     The longest common prefix is related to the concept of shared starting characters among all strings in the array.
     How can you efficiently compare these starting characters to determine the longest common sequence?

 Think about techniques that involve:

     Iterating through the strings.
     Comparing characters at the same position across all strings.
     Updating a variable to store the common prefix as you iterate.

 Remember:

     The length of the common prefix can't be greater than the length of the shortest string in the array.
     An empty input array or an array of all different strings will result in an empty common prefix.
 ```