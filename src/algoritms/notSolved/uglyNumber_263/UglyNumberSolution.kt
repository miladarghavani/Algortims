package algoritms.notSolved.uglyNumber_263
class Solution {
    fun isUgly(n: Int): Boolean {

        return true
    }
}

fun main() {
    PerformanceTester.measureExecution(1000) {
        Solution().isUgly(6)
    }

    val tests = listOf(
        6 to true,
        1 to true,
        14 to false,
        8 to true,
        7 to false
    )

    for ((input, expected) in tests) {
        val result = Solution().isUgly(input)
        println("Input: n = $input => Output: $result (Expected: $expected)")
    }
}