package com.example.algoritms.easy.e202HappyNumber


class SolutionMohamad{
    fun isHappy(n: Int): Boolean {
        var input = n
        var xItem = 0
        do {
            xItem ++
            var result = 0
            input.toString().forEach {
                var digit = it.digitToInt()
                digit *= digit
                result += digit
                if (result != 1)
                    input = result
            }
        } while (result != 1 && xItem < 10)
        if (xItem >= 10)
            return false
        return true
    }
}
class SolutionJatlin{
    fun isHappy(n: Int): Boolean {
        if (n == 1) return true

        val visited = hashSetOf<Int>()
        var isHappy = false
        var current = n
        var sum: Int

        while (!isHappy && visited.add(current)) {
            sum = 0
            current.forEachDigit { digit -> sum += digit * digit }
            isHappy = sum == 1
            current = sum
        }
        return isHappy
    }
    private inline fun Int.forEachDigit(
        block: (digit: Int) -> Unit
    ) {
        var n = this
        while (n != 0) {
            block(n % 10)
            n /= 10
        }
    }
}

class SolutionMilad {
    fun isHappy(n: Int): Boolean {
        return happilyEverAfter(n , mutableListOf())
    }

    private fun happilyEverAfter(n: Int, sumArray: MutableList<Int>):Boolean {
        val stringVar = n.toString().toCharArray()

        var sum = 0
        stringVar.forEachIndexed { _, c ->
            val int = c.toString().toInt()
            sum += int*int
        }
        if (sum == 1) return true
        if (sumArray.contains(sum)) return false
        sumArray.add(sum)
        return happilyEverAfter(sum,sumArray)
    }
}
fun main() {
    val tests = listOf(
        797 to false,
        1999999999 to false,
        11 to false,
        19 to true,
        2 to false,
        7 to true,
        1 to true,
        20 to false
    )

    for ((input, expected) in tests) {
        val result = SolutionMohamad().isHappy(input)
        println("Input: n = $input => Output: $result (Expected: $expected)")
    }
}

