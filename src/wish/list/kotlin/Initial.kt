package wish.list.kotlin

import java.util.*

object Initial {
    var item_name: String = ""
    var item_cost: Double = 0.0
    var money_bank: Double = 0.0

    fun welcome() {
        println("Welcome to Wishlist")
        println()
    }

    fun name(input: Scanner) {
        val itemName: String

        println("What is it you are saving for? ")
        itemName = input.nextLine()

        item_name = itemName
    }

    fun cost(input: Scanner) {
        val itemCost: Double
        val itemName: String = item_name

        println("How much is $itemName?")
        itemCost = java.lang.Double.parseDouble(input.nextLine())

        item_cost = itemCost
    }

    fun bank(input: Scanner) {
        val moneyBank: Double

        println("Enter the amount of money you have saved: ")
        moneyBank = java.lang.Double.parseDouble(input.nextLine())

        money_bank = moneyBank
    }
}