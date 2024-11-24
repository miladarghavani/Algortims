//package algoritms.easy.guessNumber_374
//
//import org.testng.AssertJUnit.assertEquals
//import org.testng.annotations.Test
//
//// Mock guess API, returns -1, 1, or 0
//var pick = 0
//fun guess(num: Int): Int {
//    return when {
//        num > pick -> -1
//        num < pick -> 1
//        else -> 0
//    }
//}
//
//class Solution {
//    fun guessNumber(n: Int): Int {
//        return  0
//    }
//}
//
//class SolutionTest {
//    private val solution = Solution()
//
//    @Test
//    fun testGuessNumber() {
//        pick = 6
//        assertEquals(6, solution.guessNumber(10))
//
//        pick = 1
//        assertEquals(1, solution.guessNumber(1))
//
//        pick = 1
//        assertEquals(1, solution.guessNumber(2))
//
//        pick = 5000000
//        assertEquals(5000000, solution.guessNumber(10000000))
//
//        pick = 10
//        assertEquals(10, solution.guessNumber(10))
//
//        pick = 231
//        assertEquals(231, solution.guessNumber(1000))
//
//        pick = 15
//        assertEquals(15, solution.guessNumber(30))
//
//        pick = 50
//        assertEquals(50, solution.guessNumber(100))
//
//        pick = 999
//        assertEquals(999, solution.guessNumber(1000))
//
//        pick = 12345
//        assertEquals(12345, solution.guessNumber(20000))
//    }
//}
