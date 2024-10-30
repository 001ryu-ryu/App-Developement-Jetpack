package com.iftikar.bankaccountprogram

fun main() {
    val iftikarBankAccount = BankAccount("Iftikar Hussain", 123.4)
    iftikarBankAccount.deposit(23.0)
    iftikarBankAccount.withdraw(2.0)
    iftikarBankAccount.deposit(2000.3)
    iftikarBankAccount.displayTransactionHistory()
}