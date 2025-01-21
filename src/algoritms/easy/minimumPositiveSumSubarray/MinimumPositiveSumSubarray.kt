package algoritms.notSolved.minimumPositiveSumSubarray

class Solution {
    fun minSubarraySumInRange(nums: IntArray, l: Int, r: Int): Int {
        var minPositiveSum = Int.MAX_VALUE
        var foundPositiveSum = false

        for (start in nums.indices) {
            var currentSum = 0
            for (end in start until nums.size) {
                currentSum += nums[end]
                val length = end - start + 1
                if (length in l..r && currentSum > 0) {
                    foundPositiveSum = true
                    minPositiveSum = minOf(minPositiveSum, currentSum)
                }
                if (length > r) break
            }
        }

        return if (foundPositiveSum) minPositiveSum else -1
    }
}

fun main() {
    // Performance testing
    PerformanceTester.measureExecution(1000) {
        Solution().minSubarraySumInRange(intArrayOf(3, -2, 1, 4), 2, 3)
    }

    // Test cases
    val tests = listOf(
        Triple(intArrayOf(3, -2, 1, 4), 2, 3) to 1,
        Triple(intArrayOf(-2, 2, -3, 1), 2, 3) to -1,
        Triple(intArrayOf(1, 2, 3, 4), 2, 4) to 3,
        Triple(intArrayOf(-5, 10, -5, 5), 2, 3) to 10,
        Triple(intArrayOf(-1, 1, 2, -2, 3), 1, 3) to 1
    )

    for ((input, expected) in tests) {
        val (nums, l, r) = input
        val result = Solution().minSubarraySumInRange(nums, l, r)
        println("Input: nums = ${nums.joinToString()}, l = $l, r = $r => Output: $result (Expected: $expected)")
    }
}

