//package com.example.algoritms.easy.e193ValidPhoneNumbers
//
//
//import org.testng.AssertJUnit.assertEquals
//import org.testng.annotations.Test
//
//class Solution {
//    fun isValidPhoneNumber(phoneNumber: String): Boolean {
//        phoneNumber.removePrefix("-").contains("a...z")
//        var con1 = phoneNumber.split(" ")
//        if (con1.isEmpty()){
//            var con2 = phoneNumber.split("-")
//            if (con2.size !=3) return false
//            con2.forEachIndexed { index, s ->
//               if (index == 2) return s.length == 4
//
//            }
//        }
//        return false
//    }
//}
//class SolutionTest {
//    private val solution = Solution1()
//
//    @Test
//    fun testIsValidPhoneNumber() {
//        assertEquals(true, solution.isValidPhoneNumber("987-123-4567"))
//        assertEquals(false, solution.isValidPhoneNumber("123 456 7890"))
//        assertEquals(true, solution.isValidPhoneNumber("(123) 456-7890"))
//        assertEquals(false, solution.isValidPhoneNumber("123-4567"))
//        assertEquals(false, solution.isValidPhoneNumber("987-123-45"))
//        assertEquals(true, solution.isValidPhoneNumber("000-000-0000"))
//        assertEquals(true, solution.isValidPhoneNumber("(000) 000-0000"))
//        assertEquals(false, solution.isValidPhoneNumber("000 000 0000"))
//        assertEquals(false, solution.isValidPhoneNumber("abc-def-ghij"))
//        assertEquals(true, solution.isValidPhoneNumber("555-555-5555"))
//        assertEquals(true, solution.isValidPhoneNumber("(555) 555-5555"))
//        assertEquals(false, solution.isValidPhoneNumber("(555)555-5555"))
//        assertEquals(false, solution.isValidPhoneNumber("555-5555"))
//        assertEquals(false, solution.isValidPhoneNumber("5555555555"))
//        assertEquals(false, solution.isValidPhoneNumber("555-555-55555"))
//        assertEquals(true, solution.isValidPhoneNumber("(111) 222-3333"))
//        assertEquals(false, solution.isValidPhoneNumber("() 555-5555"))
//        assertEquals(false, solution.isValidPhoneNumber("(555)5555555"))
//        assertEquals(true, solution.isValidPhoneNumber("123-456-7890"))
//        assertEquals(false, solution.isValidPhoneNumber("(123)456-7890"))
//    }
//}