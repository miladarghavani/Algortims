# Problem: [Minimum Positive Sum Subarray](https://leetcode.com/problems/minimum-positive-sum-subarray/description/) (LeetCode Problem #3364)

## Problem Description
Given an integer array `nums`, your task is to find the minimum positive sum of any contiguous subarray of `nums`.

A **subarray** is a contiguous part of an array. For example, `[1, 2, 3]` is a subarray of the array `[1, 2, 3, 4]`.

### Constraints:
- The length of the array will be at most `1000`.
- The array elements can range between `[-10^4, 10^4]`.
- The array will not be empty and will always have at least one element.

### Example 1:
**Input:**  
`nums = [-1, 2, 3, -4, 5]`

**Output:**  
`6`

**Explanation:**  
The minimum positive sum subarray is `[2, 3, -4, 5]`, which gives the sum of `6`.

### Example 2:
**Input:**  
`nums = [-1, -2, -3]`

**Output:**  
`-1`

**Explanation:**  
There is no positive sum subarray, so the result is `-1`.

### Example 3:
**Input:**  
`nums = [1, 1, 1, 1]`

**Output:**  
`1`

**Explanation:**  
The minimum positive sum subarray is `[1]`, which gives the sum of `1`.

### Example 4:
**Input:**  
`nums = [-5, 5, 10, -2]`

**Output:**  
`5`

**Explanation:**  
The minimum positive sum subarray is `[5]`, which gives the sum of `5`.

### Example 5:
**Input:**  
`nums = [-1, -2, 0, 3, -4]`

**Output:**  
`3`

**Explanation:**  
The minimum positive sum subarray is `[3]`, which gives the sum of `3`.

## LeetCode Description
A subarray is a contiguous part of an array. The challenge is to find the minimum positive sum that can be obtained from any contiguous subarray in the given array.

### Hint:
- **Iterate through the array** and keep track of the sum of elements in a subarray.
- **Reset the sum** when it becomes negative, as we are only interested in positive sums.
- Your task is to find the **smallest positive sum**. If no positive sum exists, return `-1`.
