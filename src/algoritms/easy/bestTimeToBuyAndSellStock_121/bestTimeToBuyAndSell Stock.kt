package com.example.algoritms.easy.e121BestTimeToBuyAndSellStock

class Solution {
    fun maxProfit(prices: IntArray): Int {

        return 0
    }
}

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculator = Solution()

            // Example 1
            val prices1 = intArrayOf(7, 1, 5, 3, 6, 4)
            println("Maximum profit for prices1: ${calculator.maxProfit(prices1)}")  // Output: 5

            // Example 2
            val prices2 = intArrayOf(7, 6, 4, 3, 1)
            println("Maximum profit for prices2: ${calculator.maxProfit(prices2)}")  // Output: 0

            // New Example 1
            val prices3 = intArrayOf(2, 4, 1)
            println("Maximum profit for prices3: ${calculator.maxProfit(prices3)}")  // Output: 2

            // New Example 2
            val prices4 = intArrayOf(3, 8, 2, 5, 10, 1)
            println("Maximum profit for prices4: ${calculator.maxProfit(prices4)}")  // Output: 8
        }
    }
}
