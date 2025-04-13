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











class Solution2 {
    fun aliceWins (n:Int) : Boolean {
        if (n < 10) return false
        var pickNumber = 10
        var round = 0
        var remainS = n
        while ( remainS - (pickNumber - round) > (pickNumber - round-1)) {
            round++
        }
        return  round%2 == 0
    }
}


fun main() {
    PerformanceTester.measureExecution(1000) { Solution().aliceWins(12) }

    val tests = listOf(
        100 to true,
        50 to true,
        30 to true,
        1 to false,
        12 to true
    )

    for ((input, expected) in tests) {
        val result = Solution2().aliceWins(input)
        println("Input: n = $input => Output: $result (Expected: $expected)")
    }
}

