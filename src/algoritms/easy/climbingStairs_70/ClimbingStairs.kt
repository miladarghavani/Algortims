package com.example.algoritms.easy.e70ClimbingStairs


import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

class Solution1 {
    fun climbStairs(n: Int): Int {
        return 0
    }
}
class SolutionTest {
    private val solution = Solution()
    @Test
    fun testClimbStairs() {
        assertEquals(2, solution.climbStairs(2))
        assertEquals(3, solution.climbStairs(3))
        assertEquals(5, solution.climbStairs(4))
        assertEquals(8, solution.climbStairs(5))
        assertEquals(13, solution.climbStairs(6))
        assertEquals(21, solution.climbStairs(7))
        assertEquals(34, solution.climbStairs(8))
        assertEquals(55, solution.climbStairs(9))
        assertEquals(89, solution.climbStairs(10))
        assertEquals(144, solution.climbStairs(11))
        assertEquals(233, solution.climbStairs(12))
        assertEquals(377, solution.climbStairs(13))
        assertEquals(610, solution.climbStairs(14))
        assertEquals(987, solution.climbStairs(15))
        assertEquals(1597, solution.climbStairs(16))
        assertEquals(2584, solution.climbStairs(17))
        assertEquals(4181, solution.climbStairs(18))
        assertEquals(6765, solution.climbStairs(19))
        assertEquals(10946, solution.climbStairs(20))
        assertEquals(17711, solution.climbStairs(21))
    }
}