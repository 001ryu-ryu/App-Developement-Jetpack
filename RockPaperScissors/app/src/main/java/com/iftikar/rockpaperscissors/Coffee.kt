package com.iftikar.rockpaperscissors
data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size:String,
    val creamAmount: Int
)
fun main() {
    val coffeeForDenis = CoffeeDetails(2, "Denis", "xxl", 0)
    makeCoffee(coffeeForDenis)

}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if(coffeeDetails.sugarCount <= 0) {
        println("no sugar for ${coffeeDetails.name}")
        return
    }

    if(coffeeDetails.sugarCount > 1) {
        println("Add ${coffeeDetails.sugarCount} spoons sugar for ${coffeeDetails.name}")
    } else {
        println("Add ${coffeeDetails.sugarCount} spoon sugar for ${coffeeDetails.name}")
    }
}