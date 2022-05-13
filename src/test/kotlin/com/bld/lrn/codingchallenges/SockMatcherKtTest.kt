package com.bld.lrn.codingchallenges

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class SockMatcherKtTest {
    
    @Test
    fun sockMatcher() {
        val input = 5
    
        val result = sockMatcher(input)
        
        assertEquals(5, result)
    }
}