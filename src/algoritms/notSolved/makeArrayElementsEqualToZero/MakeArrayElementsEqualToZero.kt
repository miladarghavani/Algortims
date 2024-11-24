package algoritms.notSolved.makeArrayElementsEqualToZero
class Solution {
    fun canBeZero(nums: IntArray): Boolean {
        val gcd = nums.reduce { acc, num -> gcd(acc, num) }
        return gcd == 1
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}

fun main() {

    PerformanceTester.measureExecution(1000 , { Solution().canBeZero(intArrayOf(4, 7, 6))})

    val tests = listOf(
        intArrayOf(4, 7, 6) to true,
        intArrayOf(1, 2, 3) to false,
        intArrayOf(0, 0, 0) to true,
        intArrayOf(10, 20, 30) to true,
        intArrayOf(3, 6, 9) to true
    )

    for ((input, expected) in tests) {
        val result = Solution().canBeZero(input)
        println("Input: nums = ${input.joinToString()} => Output: $result (Expected: $expected)")
    }
}
