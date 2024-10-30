package com.iftikar.bankaccountprogram

class BankAccount(private val accountHolder: String, private var balance: Double) {
    private  val transactionHistory = mutableListOf<String>()


    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if(amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        } else {
            println("You cannot withdraw!")
        }
    }



    fun displayTransactionHistory() {
        println("Transaction history for $accountHolder:")
        for (history in transactionHistory) {
            println(history)
        }

        println("Current balance is $balance")
    }

}