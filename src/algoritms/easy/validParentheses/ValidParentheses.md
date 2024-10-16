package com.example.algoritms.easy.validParentheses

20. Valid Parentheses

https://leetcode.com/problems/valid-parentheses/description/

--leetCode--
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.



Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false



Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.

-- Hints --

    Use a Stack: Think about using a stack to help keep track of the brackets.
    Matching Pairs: Create a mapping of closing brackets to their corresponding opening brackets.
    Iterate Through the String:
        If you encounter an opening bracket, push it onto the stack.
        If you encounter a closing bracket, check the top of the stack.
    Check for Balance:
        When you encounter a closing bracket, pop the top of the stack and see if it matches the expected opening bracket.
        If the stack is empty when you encounter a closing bracket, the string is not valid.
    Final Check: After iterating through the string, if the stack is empty, the string is valid; otherwise, it’s not.