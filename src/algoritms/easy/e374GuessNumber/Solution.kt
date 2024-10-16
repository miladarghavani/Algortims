package algoritms.easy.e374GuessNumber

class Solution1 {
    fun guessNumber(n: Int): Int {
        var low = 1
        var high = n

        while (low <= high) {
            val mid = low + (high - low) / 2
            when (guess(mid)) {
                -1 -> high = mid - 1
                1 -> low = mid + 1
                0 -> return mid
            }
        }
        return -1 // Should never reach here
    }
}