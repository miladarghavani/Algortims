package com.example.algoritms.easy.e193ValidPhoneNumbers

class Solution1 {
    fun isValidPhoneNumber(phoneNumber: String): Boolean {
        val regex1 = Regex("""\(\d{3}\) \d{3}-\d{4}""")
        val regex2 = Regex("""\d{3}-\d{3}-\d{4}""")
        return regex1.matches(phoneNumber) || regex2.matches(phoneNumber)
    }
}