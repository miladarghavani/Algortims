

   202.Happy Number
https://leetcode.com/problems/happy-number/description/

    A happy number is defined by the following process:
    1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
    2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    3. A number is happy if this process ends in 1.
    
You need to implement a function `isHappy(n: Int): Boolean` that returns `true` if the number `n` is happy and `false` otherwise.
    
    Example 1:
    Input: n = 19
    Output: true
    Explanation:
    1^2 + 9^2 = 82
    8^2 + 2^2 = 68
    6^2 + 8^2 = 100
    1^2 + 0^2 + 0^2 = 1
    
    Example 2:
    Input: n = 2
    Output: false
    
    Constraints:
    - 1 <= n <= (2^31) - 1
    
    
Hint 1: Think about how to transform a number by summing the squares of its digits.
Hint 2: Consider using a set to track numbers you've encountered to detect loops.
Hint 3: The problem ends when you either reach 1 or enter a repeating cycle."