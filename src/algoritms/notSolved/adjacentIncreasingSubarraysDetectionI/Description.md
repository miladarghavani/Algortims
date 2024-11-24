# Problem: [Adjacent Increasing Subarrays Detection I](https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i/description/) (LeetCode Problem #3349)

## Problem Description
Given an integer array `nums` of length `n`, you are asked to detect whether there are two **adjacent** increasing subarrays of length 3 or more in the array.

- An **increasing subarray** is a subarray of at least 3 consecutive numbers where each number is strictly greater than the previous number.
- You need to return `true` if there are two such adjacent increasing subarrays of length 3 or more, and `false` otherwise.

### Constraints:
- The length of the array is at most `1000`.
- The elements of the array can be in the range `[-10^4, 10^4]`.

### Example 1:
**Input:**  
`nums = [1, 2, 3, 1, 2, 3]`

**Output:**  
`true`

**Explanation:**  
The two increasing subarrays are:
- [1, 2, 3] (starting at index 0)
- [1, 2, 3] (starting at index 3)

These subarrays are adjacent and of length 3 or more, so the answer is `true`.

### Example 2:
**Input:**  
`nums = [1, 2, 3, 4]`

**Output:**  
`false`

**Explanation:**  
There is only one increasing subarray [1, 2, 3, 4], so the answer is `false`.

### Example 3:
**Input:**  
`nums = [1, 3, 2, 4, 5, 6]`

**Output:**  
`false`

**Explanation:**  
Although the array contains an increasing subarray [4, 5, 6], there is no adjacent subarray that is also increasing.

## LeetCode Description
The task is to detect adjacent increasing subarrays of length 3 or more in the given array.

### Hint:
- Iterate through the array and find all increasing subarrays of length 3 or more.
- Check if two such subarrays are adjacent in the array.

