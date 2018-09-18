package wish.list.kotlin

import com.sun.xml.internal.fastinfoset.util.StringArray
import wish.list.kotlin.WishlistMain.Companion.input
import java.io.File
import java.io.FileNotFoundException
import java.io.PrintWriter

object WishlistDatabase {

    @Throws(FileNotFoundException::class)
    fun database() {
        val item = arrayOfNulls<String>(100)
        val cost = arrayOfNulls<Double>(100)

        var confirm: String
        var fileName: String

        var i = 1

        println()
        println("Hello! Welcome to the Wishlist Database!")
        println()
        println("What would you like to name your database?")
        fileName = input.nextLine()

        val fin = File(fileName)

        if (fin.exists() && !fin.isDirectory) do {
                println()
                println("That file name already exists. Please enter another file name: ")
                fileName = input.nextLine()
        }
        while (fin.exists() && !fin.isDirectory)

        val out = PrintWriter(fileName)

        println()
        println("Enter your first item: ")
        item[0] = input.nextLine()

        println("Enter the cost of that item: ")
        cost[0] = java.lang.Double.parseDouble(input.nextLine())

        out.println(item[0])
        out.println(cost[0])

        println("Item Stored!")
        println()

        do {
            println("Would you like to store another value? (yes/no)")
            confirm = input.nextLine()

            if (confirm == "yes") {
                println("Enter an item: ")
                item[i] = input.nextLine()

                println("Enter the cost of that item: ")
                cost[i] = java.lang.Double.parseDouble(input.nextLine())

                out.println(item[i])
                out.println(cost[i])

                println("Item Stored!")
                println()

                i++
            }
        }
        while (confirm == "yes")

        println("Okay! Thankyou for using Wishlist Database! All items (if any) have been stored!")
        println()
        println("Thanky you for using Wishlist!")

        out.flush()
        out.close()
    }
}