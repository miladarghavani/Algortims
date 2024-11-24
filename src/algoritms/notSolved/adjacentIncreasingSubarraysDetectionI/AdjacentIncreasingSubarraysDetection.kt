package algoritms.notSolved.adjacentIncreasingSubarraysDetectionI

class Solution {
    fun hasAdjacentIncreasingSubarrays(nums: IntArray): Boolean {
        var firstSubarrayEnd = -1
        for (i in 2 until nums.size) {
            if (nums[i] > nums[i - 1] && nums[i - 1] > nums[i - 2]) {
                if (firstSubarrayEnd != -1 && i - firstSubarrayEnd >= 3) {
                    return true
                }
                firstSubarrayEnd = i
            }
        }
        return false
    }
}

fun main() {
    val tests = listOf(
        intArrayOf(1, 2, 3, 1, 2, 3) to true,
        intArrayOf(1, 2, 3, 4) to false,
        intArrayOf(1, 3, 2, 4, 5, 6) to false,
        intArrayOf(3, 4, 5, 6) to false,
        intArrayOf(5, 6, 7, 8, 1, 2, 3) to true
    )

    for ((input, expected) in tests) {
        val result = Solution().hasAdjacentIncreasingSubarrays(input)
        println("Input: nums = ${input.joinToString()} => Output: $result (Expected: $expected)")
    }
}
