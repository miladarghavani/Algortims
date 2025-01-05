# Problem: [Make Array Elements Equal to Zero](https://leetcode.com/problems/make-array-elements-equal-to-zero/description/) (LeetCode Problem #3354)

## Problem Description
You are given an integer array `nums`. You can perform the following operation on the array:

- Choose any two indices `i` and `j` such that `i != j`, and set `nums[i] = nums[i] - nums[j]`.

You need to perform this operation until all elements of the array become zero. Your task is to return `true` if it is possible to make all elements of the array equal to zero by performing the operation any number of times, and `false` otherwise.

### Constraints:
- The length of the array will be at most `1000`.
- The array elements can range between `[-10^4, 10^4]`.

### Example 1:
**Input:**  
`nums = [4, 7, 6]`

**Output:**  
`true`

**Explanation:**  
We can perform the following operations to make all elements zero:
1. `nums[1] = nums[1] - nums[0]` → `nums = [4, 3, 6]`
2. `nums[2] = nums[2] - nums[1]` → `nums = [4, 3, 3]`
3. `nums[0] = nums[0] - nums[2]` → `nums = [1, 3, 3]`
4. `nums[1] = nums[1] - nums[2]` → `nums = [1, 0, 3]`
5. `nums[2] = nums[2] - nums[0]` → `nums = [1, 0, 2]`
6. `nums[2] = nums[2] - nums[0]` → `nums = [1, 0, 1]`
7. `nums[0] = nums[0] - nums[2]` → `nums = [0, 0, 0]`

Thus, it is possible to make all elements equal to zero.

### Example 2:
**Input:**  
`nums = [1, 2, 3]`

**Output:**  
`false`

**Explanation:**  
There is no way to make all elements zero by performing the operation any number of times.

### Example 3:
**Input:**  
`nums = [0, 0, 0]`

**Output:**  
`true`

**Explanation:**  
All elements are already zero, so no operation is needed.

## LeetCode Description
The task is to determine whether it is possible to make all elements of an array equal to zero by repeatedly subtracting elements from each other.

### Hint:
- **Think about the greatest common divisor (GCD).** If the GCD of all elements is greater than `1`, then it is impossible to make all elements zero.
- Consider the fact that you can repeatedly subtract the elements, which will effectively reduce them by their greatest common divisor.
