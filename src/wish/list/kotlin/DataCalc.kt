package wish.list.kotlin

import kotlin.system.exitProcess

object DataCalc {

    fun dataCalc() {
        var income: Double
        var weeksTill: Double
        var moneyNeed: Double
        val moneyBank: Double
        var itemCost: Double
        var disIn: Double
        var maxDis: Double

        var payRate: String
        var itemName: String
        var confirm: String

        var i = 0

        println()
        println("Hello and welcome to the Wishlist Access Calculator where you can calculate how it will take you to get items from your Database file!")
        println()
        println("First off we have to find out how much money you have for the item you want. So we shall start there.")
        println()

        Initial.bank(input)

        moneyBank = Initial.money_bank

        println("Okay! Now that we have that all set, lets continue!")
        println()
        println("Would you like to start calculating? (yes/no)")
        confirm = input.nextLine()

        if (confirm == "yes") {

            do {
                itemName = Access.item[i]!!
                itemCost = Access.cost[i]!!

                moneyNeed = itemCost - moneyBank

                println()
                println("Okay we will do calculations for the next item in your file, which is $itemName.")
                println()
                println("Okay and from all of that we can gather that so far you have $moneyBank dollars. And you need $moneyNeed dollars more in order to get $itemName.")
                println()
                println("Now we can start the calculations for $itemName.")
                println()
                println("Alright, could you start by stating whether you get paid weekly or bi-weekly?")
                payRate = input.next()

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

                    weeksTill = moneyNeed / maxDis

                    println()
                    println("Calculating...")
                    println()
                    println("Okay so if you want to continue saving for $itemName with the set amount of $maxDis being put away each week, then you will need to save for about $weeksTill more weeks!")
                    println()
                    println("Good luck on your saving! Would you like to calculate another item in your file (if one is present)? (yes/no)")
                    confirm = input.nextLine()
                } else if (payRate == "bi-weekly") {
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

                    weeksTill = (moneyNeed / maxDis) / 2

                    println()
                    println("Calculating...")
                    println()
                    println("Okay so if you want to continue saving for $itemName with the set amount of $maxDis being put away every two weeks, then you will need to save for about $weeksTill more weeks!")
                    println()
                    println("Good luck on your saving! Would you like to calculate another item in your file (if one is present)? (yes/no)")
                    confirm = input.nextLine()
                } else {
                    println()
                    println("I'm sorry I can't understand what you entered. Goodbye.")
                    exitProcess(0)
                }

                i++

            } while (confirm == "yes" && input.hasNextLine())

        } else {
            println()
            println("Okay! You are welcome to use the application anytime!")
            exitProcess(0)
        }

        println()
        println("Thank you for utilizing Wishlist Access Calculator!")
        println()
        println("Thank you for using Wishlist!")
    }
}