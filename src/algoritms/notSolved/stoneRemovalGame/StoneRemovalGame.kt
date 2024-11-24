class Solution {
    fun stoneGame(stones: Int): Boolean {
        return stones % 2 != 0
    }
}

fun main() {
    PerformanceTester.measureExecution(1000 , { Solution().stoneGame(5)})

    val tests = listOf(
        5 to true,
        6 to false,
        3 to true,
        4 to false,
        7 to true
    )

    for ((input, expected) in tests) {
        val result = Solution().stoneGame(input)
        println("Input: stones = $input => Output: $result (Expected: $expected)")
    }
}
