package wish.list.kotlin

import wish.list.kotlin.WishlistMain.Companion.input
import java.io.File
import java.io.FileNotFoundException
import java.util.*

object WishlistAccess {
    var item = arrayOfNulls<String>(100)
    var cost = arrayOfNulls<Double>(100)

    @Throws(FileNotFoundException::class)
    fun access() {
        val fileName: String

        val i = 0

        println()
        println("Okay! Lets go and access your file then.")
        println()
        println("Please enter your file name: ")
        fileName = input.nextLine()

        val fin = Scanner(File(fileName))

        do {
            item[i] = fin.nextLine()
            cost[i] = java.lang.Double.parseDouble(fin.nextLine())

            println()
            println("Item retrieved: " + item[i] + "\nCost: " + cost[i])
        }
        while (fin.hasNextLine())

        println()
        println("No more items were listed. File fully accessed!")

        fin.close()
    }
}