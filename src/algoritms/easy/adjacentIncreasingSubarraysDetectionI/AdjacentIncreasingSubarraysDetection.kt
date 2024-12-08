package algoritms.easy.adjacentIncreasingSubarraysDetectionI

class Solution {
    fun hasAdjacentIncreasingSubarrays(nums: IntArray): Boolean {
        var firstSubarrayEnd = -1
        for (i in 2..<nums.size) {
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
class SolutionMilad {
    fun hasAdjacentIncreasingSubarrays(nums: IntArray): Boolean {
        var firstSubarrayEnd = -1
        var secondSubarrayEnd = -1

        for (i in 2..<nums.size) {
            if (nums[i] > nums[i - 1] && nums[i - 1] > nums[i - 2]) {
                if (firstSubarrayEnd != -1 && i - firstSubarrayEnd >= 3) {

                }
                firstSubarrayEnd = i
            }
        }
        return false
    }
}

fun main() {
    PerformanceTester.measureExecution(1000 , { SolutionMilad().hasAdjacentIncreasingSubarrays( intArrayOf(1, 2, 3, 1, 2, 3))})

    val tests = listOf(
        intArrayOf(1, 2, 3, 1, 2, 3) to true,
        intArrayOf(5 , 6, 8, 1, 2, 4) to true,
        intArrayOf(1, 3, 2, 4, 5, 6) to false,
        intArrayOf(3, 4, 5, 6) to false,
        intArrayOf(1,2,3,4,4,4,4,5,6,7) to false,
        intArrayOf(5, 6, 7, 8, 1, 2, 3) to true
    )

    for ((input, expected) in tests) {
        val result = SolutionMilad().hasAdjacentIncreasingSubarrays(input)
        println("Input: nums = ${input.joinToString()} => Output: $result (Expected: $expected)")
    }
}
