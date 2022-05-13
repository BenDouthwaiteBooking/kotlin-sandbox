package com.bld.lrn.textgamedemo

import java.io.File

fun readLocationInfo() : Map<Int, Location> {
    
    val locations = mutableMapOf<Int, Location>()
    
    File("locations_big.txt").reader().forEachLine {
        val tokens = it.split("`")
        
        val location = Location(tokens[0].toInt(), tokens[1])
        locations[location.locationId] = location
    }
    
    File("direction_big.txt").reader().forEachLine {
        val tokens = it.split(",")
        
        // If not null, then fo something
        locations[tokens[0].toInt()]?.addExit(tokens[1], tokens[2].toInt())
    }
    
    return locations
}