package com.bld.lrn.codingchallenges

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class SockMatcherKtTest {
    
    @Test
    fun sockMatcher_descriptionCase() {
        // given
        val input = arrayOf(1,2,1,2,1,3,2)
    
        // when
        val result = sockMatcher(input)
        
        // then
        assertEquals(2, result)
    }
    
    @Test
    fun sockMatcher_allMatching() {
        // given
        val input = arrayOf(5,5,5,5,5,5)
        
        // when
        val result = sockMatcher(input)
        
        // then
        assertEquals(3, result)
    }
    
    @Test
    fun sockMatcher_noneMatching() {
        // given
        val input = arrayOf(1,2,3,4,5,6)
        
        // when
        val result = sockMatcher(input)
        
        // then
        assertEquals(0, result)
    }
    
    @Test
    fun sockMatcher_allPairs_highNumbers() {
        // given
        val input = arrayOf(100,200,300,100,200,300)
        
        // when
        val result = sockMatcher(input)
        
        // then
        assertEquals(3, result)
    }
}