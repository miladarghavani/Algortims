package algoritms.easy.makeArrayElementsEqualToZero
class Solution {
    fun canBeZero(nums: IntArray): Int {
        var startList = mutableListOf<Int>()
        var count = 0
        for (i in 0..nums.lastIndex) {
            if (nums[i] == 0) {
                startList.add(i)
            }
        }
        startList.forEachIndexed { i , num ->
            if (i != nums.lastIndex){
                if (moveToRight(nums , i)) count++
                if (moveToLeft(nums, i)) count++
            }
        }

        return count
    }

    private fun moveToLeft(nums: IntArray, i: Int): Boolean {
        if (chckisz(nums)) return true
        if (i==0&&nums[i] == 0) return false
        if (nums[i-1]==0) {
            return moveToLeft(nums, i-1)
        }else {
            nums[i-1] = nums[i-1] - 1
            if (chckisz(nums)) return true
            return moveToRight(nums, i)
        }
    }

    private fun moveToRight(nums: IntArray, i: Int): Boolean {

        if (i == nums.lastIndex) {
            return false
        }
        if (nums[i+1] == 0){
           return moveToRight(nums, i+1)
        }else{
            nums[i+1] = nums[i+1] - 1
            if (chckisz(nums)) return true
            return moveToLeft(nums,i)
        }
    }

    private fun chckisz(nums: IntArray):Boolean {
        var o = 0
        nums.forEach{num ->
            o += num
        }
        return o==0
    }
}

fun main() {

    PerformanceTester.measureExecution(1000 , { Solution().canBeZero(intArrayOf(4, 7, 6))})

    val tests = listOf(
        intArrayOf(1,0,2,0,3) to 2,
    )

    for ((input, expected) in tests) {
        val result = Solution().canBeZero(intArrayOf(1,0,2,0,3))
        println("Input: nums = ${input.joinToString()} => Output: $result (Expected: $expected)")
    }
}
