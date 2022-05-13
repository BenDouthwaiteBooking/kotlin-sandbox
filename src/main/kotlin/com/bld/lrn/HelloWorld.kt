package com.bld.lrn

fun main(args: Array<String>) {
    println("Hello, World!")
    
    syntaxDemo()
}

fun syntaxDemo() {
    
    // `val` is immutable, type is inferred from assigned value.
    // Aim for immutability by default.
    val name = "Jim"
    
    // `var` is mutable
    var salary = 20
    salary = 30
}
