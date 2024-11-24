package algoritms.notSolved.minimumPositiveSumSubarray

class Solution {
    fun minPositiveSum(nums: IntArray): Int {
        var currentSum = 0
        var minPositiveSum = Int.MAX_VALUE
        var foundPositiveSum = false

        for (num in nums) {
            currentSum += num
            if (currentSum > 0) {
                foundPositiveSum = true
                minPositiveSum = minOf(minPositiveSum, currentSum)
            }
            if (currentSum <= 0) {
                currentSum = 0
            }
        }

        return if (foundPositiveSum) minPositiveSum else -1
    }
}

fun main() {
    val tests = listOf(
        intArrayOf(-1, 2, 3, -4, 5) to 6,
        intArrayOf(-1, -2, -3) to -1,
        intArrayOf(1, 1, 1, 1) to 1,
        intArrayOf(-5, 5, 10, -2) to 5,
        intArrayOf(-1, -2, 0, 3, -4) to 3
    )

    for ((input, expected) in tests) {
        val result = Solution().minPositiveSum(input)
        println("Input: nums = ${input.joinToString()} => Output: $result (Expected: $expected)")
    }
}
