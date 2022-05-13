package com.bld.lrn.codingchallenges

fun sockMatcher(arrayOfSockColours: Array<Int>): Int {
    
    
    
    // Create a map of the colours of each sock, and initialise the values.
    val mapOfColours: MutableMap<Int, Int> = mutableMapOf()
    for (element in arrayOfSockColours) {
        if (!mapOfColours.containsKey(element)) {
            mapOfColours[element] = 1
        } else {
            mapOfColours[element] = mapOfColours[element]!! + 1
        }
    }
    println(mapOfColours)
    
    // todo - kotlin has a lot of built in functions. Can we do the above ^ any easier? ( hint:
    //  myCountingMap = myInputList.groupingBy { it }
    
    // Given our map values, count the number of matching pairs.
    
    var firstCount = mapOfColours[1]
    var secondCount = mapOfColours[2]
    var thirdCount = mapOfColours[3]
    
    var numOfPairs = firstCount?.div(2)
    var numOfPairs2 = secondCount?.div(2)
    var numOfPairs3 = thirdCount?.div(2)
    
    
    return numOfPairs!! + numOfPairs2!! + numOfPairs3!!
    
}