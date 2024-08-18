package com.example.algoritms.easy.e202HappyNumber

class Solution1 {
    fun isHappy(n: Int): Boolean {
        var num = n
        val seenNumbers = mutableSetOf<Int>()

        while (num != 1 && !seenNumbers.contains(num)) {
            seenNumbers.add(num)
            num = getNextNumber(num)
        }

        return num == 1
    }

    private fun getNextNumber(n: Int): Int {
        var num = n
        var sum = 0
        while (num > 0) {
            val digit = num % 10
            sum += digit * digit
            num /= 10
        }
        return sum
    }
}
