class Solution {
    fun aliceWins(n: Int): Boolean {
        var stonesLeft = n
        var currentRemove = 10

        while (stonesLeft > 0) {
            if (stonesLeft < currentRemove) return false
            stonesLeft -= currentRemove
            currentRemove--
        }
        return true
    }
}

fun main() {
    PerformanceTester.measureExecution(1000) { Solution().aliceWins(100) }

    val tests = listOf(
        100 to true,
        50 to true,
        30 to true,
        25 to false,
        75 to false
    )

    for ((input, expected) in tests) {
        val result = Solution().aliceWins(input)
        println("Input: n = $input => Output: $result (Expected: $expected)")
    }
}

