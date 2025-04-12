# Single Number - 136

**Difficulty**: Easy  
https://leetcode.com/problems/single-number/description/

---

## Problem

Given a non-empty array of integers `nums`, every element appears **twice** except for **one**. Find that single one.

You must implement a solution with **linear runtime complexity** and use only **constant extra space**.

---

## Examples

**Example 1**  
Input: `nums = [2,2,1]`  
Output: `1`

**Example 2**  
Input: `nums = [4,1,2,1,2]`  
Output: `4`

**Example 3**  
Input: `nums = [1]`  
Output: `1`

---

## Constraints

- `1 <= nums.length <= 3 * 10^4`
- `-3 * 10^4 <= nums[i] <= 3 * 10^4`
- Each element in the array appears **twice** except for one element which appears **only once**.

---


# Spoiler Alert

## Hint For The Problem Solution

---
## Approach

We need:
- **Linear time** `O(n)`
- **Constant space** `O(1)`

Using **XOR** satisfies both.

### XOR Properties:
- `a ^ a = 0`
- `a ^ 0 = a`
- XOR is commutative and associative

So, XORing all elements gives the number that appears only once, because all duplicates cancel each other out.

Example:
