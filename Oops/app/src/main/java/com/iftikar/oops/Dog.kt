package com.iftikar.oops

class Dog(val name:String){
    init {
        bark(name)
    }
    fun bark(name:String) {
        println("Woof woof")
    }
}