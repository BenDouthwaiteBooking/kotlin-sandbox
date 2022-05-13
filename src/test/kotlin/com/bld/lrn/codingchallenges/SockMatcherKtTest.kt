package com.bld.lrn.codingchallenges

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class SockMatcherKtTest {
    
    @Test
    fun sockMatcher() {
        // given
        val input = arrayOf(1,2,1,2,1,3,2)
    
        // when
        val result = sockMatcher(input)
        
        // then
        assertEquals(2, result)
    }
}