package com.bld.lrn.textgamedemo

fun main(args: Array<String>) {
    
    val locations = readLocationInfo()
    
    var loc = 64
    
    while (true) {
        
        // Setting a default value, if null on lookup.
        // Use 'elvis operator'
        val location = locations[loc] ?: Location(0, "Error - terminate")
        
        println(location.description)
        
        if (location.locationId == 0) {
            break
        }
        
        print("Exits: ")
        location.exits.keys.forEach {
            print("$it, ")
        }
        
        val direction = readLine()?.toUpperCase() ?: "Z"
        if (location.exits.containsKey(direction)) {
            
            // '!!' means I'm sure it is not null at this point
            loc = location.exits[direction]!!
        }
        else {
            println("Invalid dir")
        }
    }
}