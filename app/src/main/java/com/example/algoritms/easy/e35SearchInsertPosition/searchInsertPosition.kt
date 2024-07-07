package com.example.algoritms.easy.e35SearchInsertPosition

fun main() {
    var solution = Solution()
    val nums1 = intArrayOf(1, 3, 5, 6)
    val target1 = 5
    println(solution.searchInsert(nums1, target1)) // Output: 2

    val nums2 = intArrayOf(1, 3, 5, 6)
    val target2 = 2
    println(solution.searchInsert(nums2, target2)) // Output: 1

    val nums3 = intArrayOf(1, 3, 5, 6)
    val target3 = 7
    println(solution.searchInsert(nums3, target3)) // Output: 4

}


class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        return 0
    }
}
