package wish.list.kotlin

import kotlin.system.exitProcess

object Calc {

    fun calc() {
        val income: Double
        val weeksTill: Double
        val moneyNeed: Double
        val moneyBank: Double
        val disIn: Double
        val maxDis: Double

        val payRate: String
        val itemName: String
        val confirm: String

        println()
        println("Hello! Welcome to Wishlist Calculator!")
        println()

        itemName = Initial.item_name
        moneyNeed = money_need
        moneyBank = Initial.money_bank

        println("You are saving up for $itemName, correct? (yes/no)")
        confirm = input.nextLine()

        if (confirm == "yes") {
            println()
            println("Great! And so far you have $moneyBank dollars. And you need $moneyNeed dollars more in order to get $itemName.")
            println()
            println("Could you start by stating whether you get paid weekly or bi-weekly?")
            payRate = input.nextLine()

            if (payRate == "weekly") {
                println("Okay and how much do you make per week?")
                income = java.lang.Double.parseDouble(input.nextLine())

                println("Okay so if you make $income dollars a week, and you need $moneyNeed . Then we can calculate how long you still have to save for.")
                println()
                println("How much disposable income do you have?")
                disIn = java.lang.Double.parseDouble(input.nextLine())

                println()
                println("How much of that disposable income would you like to put towards $itemName each week?")
                maxDis = java.lang.Double.parseDouble(input.nextLine())

                println()
                println("Okay so you make $income every week and you are able to spend $disIn each week and plan to put away $maxDis every week towards $itemName .")

                weeksTill = moneyNeed/maxDis

                println()
                println("Calculating...")
                println()
                println("Okay so if you want to continue saving for $itemName with the set amount of $maxDis being put away each week, then you will need to save for about $weeksTill more weeks!")
                println()
                println("Good luck on your saving! Thank you for utiliizing Wishlist Calculator!")
            }
            else if (payRate == "bi-weekly") {
                println("Okay and how much do you make every two weeks?")
                income = java.lang.Double.parseDouble(input.nextLine())

                println("Okay so if you make $income dollars every two weeks, and you need $moneyNeed . Then we can calculate how long you still have to save for.")
                println()
                println("How much disposable income do you have?")
                disIn = java.lang.Double.parseDouble(input.nextLine())

                println()
                println("How much of that disposable income would you like to put towards $itemName every 2 weeks?")
                maxDis = java.lang.Double.parseDouble(input.nextLine())

                println()
                println("Okay so you make $income every two weeks and you are able to spend $disIn every two weeks and plan to put away $maxDis every two weeks towards $itemName .")

                weeksTill = (moneyNeed/maxDis)/2

                println()
                println("Calculating...")
                println()
                println("Okay so if you want to continue saving for $itemName with the set amount of $maxDis being put away every two weeks, then you will need to save for about $weeksTill more weeks!")
                println()
                println("Good luck on your saving! Thank you for utiliizing Wishlist Calculator!")
            }
            else {
                println()
                println("I'm sorry I can't understand what you entered. Goodbye.")
                exitProcess(0)
            }
        }
        else if (confirm == "no") {
            println("Okay, please utilize the Intial Wishlist Application in order to continue with this program. \n If the wrong item showed up please redo the input in the Intial Wishlist Application.")
            exitProcess(0)
        }
    }
}