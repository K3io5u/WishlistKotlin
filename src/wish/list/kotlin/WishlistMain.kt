package wish.list.kotlin

import java.io.FileNotFoundException
import java.util.*
import kotlin.system.exitProcess

class WishlistMain {
    companion object {
        var money_need: Double = 0.0
        val input = Scanner(System.`in`)
    }

    fun main(args: Array<String>) {
        try {
            val moneyBank: Double
            val itemCost: Double
            val moneyNeed: Double

            val itemName: String
            val dataAgree: String
            val calcAgree: String
            val dataBase: String

            WishlistInitial.welcome()

            println("Do you have a database file with this program from a previous use? (yes/no)")
            dataBase = input.nextLine()

            if (dataBase == "yes") {
                WishlistAccess.access()

                println()
                println("Now that you have accessed your file and its items you will be transferred to the Access Calculator to choose the item you wish to calculate.")
                println()
                println("Trasnferring now.. Thank you!")
                println()

                WishlistDataCalc.dataCalc()
            }
            else if (dataBase == "no") {
                println()
                println("Okay! Let us start from scratch then.")
                println()

                WishlistInitial.name(input)
                WishlistInitial.cost(input)
                WishlistInitial.bank(input)

                itemName = WishlistInitial.item_name
                itemCost = WishlistInitial.item_cost
                moneyBank = WishlistInitial.money_bank
                moneyNeed = itemCost - moneyBank
                money_need = moneyNeed

                if (moneyBank < itemCost) {
                    println()
                    println("You still need: $moneyNeed")
                    println()
                    println("Money acquired = $moneyBank")
                    println()
                    println("Would you like to use the Wishlist Calculator to see how long it would take you to get $itemName? (yes/no)")
                    calcAgree = input.nextLine()

                    if (calcAgree == "yes") {
                        println("Okay! Lets get started! I will transfer you to the Wishlist Calculator!")
                        println()

                        WishlistCalc.calc()
                    }
                    else if (calcAgree == "no") {
                        println()
                        println("Okay, you are welcome to utilize it anytime!")
                    }
                }
                else {
                    println()
                    println("You have enough money to get $itemName!")
                    println()
                    println("Thank you for using and trying out Wishlist!")
                }

                println()
                println("Would you like to store this item and maybe other items in this app to use and look up again? (yes/no)")
                dataAgree = input.nextLine()

                if (dataAgree == "yes") {
                    println()
                    println("Okay! I will transfer you to the Wishlist Database to store some items of yours to use again later!")
                    println()

                    WishlistDatabase.database()
                }
                else if (dataAgree == "no") {
                    println()
                    println("Okay, you are welcome to utilize it anytime! Thank you for using Wishlist!")
                }
            }

            input.close()

        } catch (ex: FileNotFoundException) {
            println("File could not be found")
            exitProcess(0)
        }
    }
}