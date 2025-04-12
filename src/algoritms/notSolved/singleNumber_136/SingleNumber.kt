package algoritms.notSolved.singleNumber_136


class Solution {
    fun singleNumber(nums: IntArray): Int {

        return 0
    }
}

fun main() {
    PerformanceTester.measureExecution(1000) {
        Solution().singleNumber(intArrayOf(4, 1, 2, 1, 2))
    }

    val tests = listOf(
        intArrayOf(2, 2, 1) to 1,
        intArrayOf(4, 1, 2, 1, 2) to 4,
        intArrayOf(1) to 1,
        intArrayOf(0, 1, 0) to 1,
        intArrayOf(17, 17, 99, 99, 42) to 42
    )

    for ((input, expected) in tests) {
        val result = Solution().singleNumber(input)
        println("Input: nums = ${input.toList()} => Output: $result (Expected: $expected)")
    }
}
