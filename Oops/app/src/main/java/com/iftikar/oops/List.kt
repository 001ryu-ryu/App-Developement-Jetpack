package com.iftikar.oops

fun main() {
    // Immutable list
    val shoppingList = listOf("Processor", "RAM", "GTX 1650", "SSD")

    //Mutable list
    val shoppingListMutable = mutableListOf("Processor", "RAM", "GTX 1650", "SSD")

    shoppingListMutable.add("Cooling System")
    shoppingListMutable.removeAt(2)
    shoppingListMutable.add(2, "RTX 4090")
    println(shoppingListMutable)

    //direct replacing at index
    shoppingListMutable[2] = "RX 7800XT"
    println(shoppingListMutable)
}